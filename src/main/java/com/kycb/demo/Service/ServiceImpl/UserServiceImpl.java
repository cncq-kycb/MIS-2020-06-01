package com.kycb.demo.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.kycb.demo.Dao.AuthorityMapper;
import com.kycb.demo.Dao.UserAuthorityMapper;
import com.kycb.demo.Dao.UserinfoMapper;
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

}
