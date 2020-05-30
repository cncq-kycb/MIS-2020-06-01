package com.kycb.demo.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.kycb.demo.Dao.AuditlogMapper;
import com.kycb.demo.Dao.AuthorityMapper;
import com.kycb.demo.Dao.EvaluationMapper;
import com.kycb.demo.Dao.OrganizationsMapper;
import com.kycb.demo.Dao.UserAuthorityMapper;
import com.kycb.demo.Dao.UserinfoMapper;
import com.kycb.demo.Pojo.Auditlog;
import com.kycb.demo.Pojo.Evaluation;
import com.kycb.demo.Pojo.EvaluationExample;
import com.kycb.demo.Pojo.MyJson;
import com.kycb.demo.Pojo.OrganizationsExample;
import com.kycb.demo.Pojo.UserAuthority;
import com.kycb.demo.Pojo.UserAuthorityExample;
import com.kycb.demo.Pojo.Userinfo;
import com.kycb.demo.Pojo.UserinfoExample;
import com.kycb.demo.Service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserinfoMapper userInfoMapper;
	@Autowired
	private UserAuthorityMapper userAuthorityMapper;
	@Autowired
	private AuthorityMapper authorityMapper;
	@Autowired
	private OrganizationsMapper organizationsMapper;
	@Autowired
	private EvaluationMapper evaluationMapper;
	@Autowired
	private AuditlogMapper auditlogMapper;

	@Override
	public Userinfo getUser(String username) {
		UserinfoExample userinfoExample = new UserinfoExample();
		userinfoExample.or().andUserNameEqualTo(username);
		try {
			List<Userinfo> userinfos = userInfoMapper.selectByExample(userinfoExample);
			if (userinfos.size() != 0) {
				return userinfos.get(0);
			}
			throw new UsernameNotFoundException("User not found");
		} catch (Exception e) {
			System.out.println(e);
			throw new DataAccessResourceFailureException("Data base err");
		}

	}

	@Override
	public List<SimpleGrantedAuthority> getAuthorities(String userId) {
		List<SimpleGrantedAuthority> result = new ArrayList<SimpleGrantedAuthority>();
		UserAuthorityExample userAuthorityExample = new UserAuthorityExample();
		userAuthorityExample.or().andUserIdEqualTo(userId);
		try {
			List<UserAuthority> userAuthoritys = userAuthorityMapper.selectByExample(userAuthorityExample);
			for (UserAuthority userAuthority : userAuthoritys) {
				result.add(new SimpleGrantedAuthority(
						authorityMapper.selectByPrimaryKey(userAuthority.getAuthorityId()).getAuthorityName()));
			}
			return result;
		} catch (Exception e) {
			System.out.println(e);
			throw new DataAccessResourceFailureException("Data base err");
		}
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			Userinfo userinfo = getUser(username);
			if (userinfo == null) {
				throw new UsernameNotFoundException("用户不存在！");
			}
			UserDetails userDetails = new User(userinfo.getUserName(), "{noop}" + userinfo.getUserPwd(),
					getAuthorities(userinfo.getUserId()));
			return userDetails;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}

	}

	@Override
	public MyJson getAllOrganizations() {
		OrganizationsExample organizationsExample = new OrganizationsExample();
		organizationsExample.or();
		try {
			return new MyJson(organizationsMapper.selectByExample(organizationsExample), "");
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(500, "数据库出错");
		}
	}

	@Override
	public MyJson register(Userinfo userinfo) {
		UserinfoExample userinfoExample = new UserinfoExample();
		userinfoExample.or().andUserNameEqualTo(userinfo.getUserName());
		try {
			List<Userinfo> userinfos = userInfoMapper.selectByExample(userinfoExample);
			if (userinfos.size() != 0) {
				return new MyJson(200, "用户名已注册");
			}
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(500, "数据库出错");
		}
		// 生成uuid
		String uuid = userInfoMapper.getUUID();
		userinfo.setUserId(uuid);
		UserAuthority userAuthority = new UserAuthority();
		userAuthority.setUserId(uuid);
		// 修改用户信息与权限信息
		switch (userinfo.getUserIdentity()) {
		case "学生":
			userinfo.setUserIdentity("student");
			userAuthority.setAuthorityId(2);
			break;
		case "教师":
			userinfo.setUserIdentity("teacher");
			userAuthority.setAuthorityId(2);
			break;
		case "管理员":
			userinfo.setUserIdentity("admin");
			userinfo.setUserOrganization("系统管理员");
			userAuthority.setAuthorityId(1);
			break;
		default:
			return new MyJson(500, "选项出错");
		}
		try {
			userInfoMapper.insert(userinfo);
			userAuthorityMapper.insert(userAuthority);
			return new MyJson(100, "注册成功");
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(500, "数据库出错");
		}
	}

	@Override
	public MyJson search(String input, String userId, String userIdentity) {
		EvaluationExample evaluationExample = new EvaluationExample();
		if (input == null) {
			evaluationExample.or().andStuIdEqualTo(userId);
		} else {
			switch (userIdentity) {
			case "student":
				evaluationExample.or().andStuIdEqualTo(userId).andEvaNameEqualTo(input);
				break;
			case "teacher":
				evaluationExample.or().andTeacherIdEqualTo(userId).andEvaNameEqualTo(input);
				break;
			default:
				return new MyJson(500, "用户类型出错");
			}
		}
		try {
			HashMap<String, Object> data = new HashMap<String, Object>();
			List<Evaluation> evaluations = evaluationMapper.selectByExampleWithBLOBs(evaluationExample);
			Userinfo userinfo = userInfoMapper.selectByPrimaryKey(userId);
			data.put("evaluations", evaluations);
			data.put("organization", userinfo.getUserOrganization());
			return new MyJson(data, "");
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(500, "数据库出错");
		}
	}

	@Override
	public MyJson audit(Auditlog auditlog, String userId) {
		try {
			Evaluation evaluation = evaluationMapper.selectByPrimaryKey(auditlog.getAuditItemid());
			Userinfo userinfo = userInfoMapper.selectByPrimaryKey(userId);
			String uuid = userInfoMapper.getUUID();
			auditlog.setAuditId(uuid);
			auditlog.setAuditUserid(userinfo.getUserId());
			auditlog.setAuditUser(userinfo.getUserName());
			auditlog.setAuditResult(0);
			auditlog.setAuditType(2);
			auditlog.setAuditTeacherid(evaluation.getTeacherId());
			auditlog.setAuditTeacher(evaluation.getTeacherName());
			auditlog.setAuditName(evaluation.getEvaName());
			auditlog.setApplyDate(new Date());
			auditlogMapper.insertSelective(auditlog);
			return new MyJson(100, "申请成功");
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(500, "数据库出错");
		}

	}

}
