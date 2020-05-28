package com.kycb.demo.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.kycb.demo.Dao.AuthorityMapper;
import com.kycb.demo.Dao.UserAuthorityMapper;
import com.kycb.demo.Dao.UserinfoMapper;
import com.kycb.demo.Pojo.Authority;
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
	public List<Authority> getAuthorities(String userId) {
		UserAuthorityExample userAuthorityExample = new UserAuthorityExample();
		userAuthorityExample.or().andUserIdEqualTo(userId);
		try {
			List<UserAuthority> userAuthoritys = userAuthorityMapper.selectByExample(userAuthorityExample);
			List<Authority> authorities = new ArrayList<Authority>();
			for (UserAuthority userAuthority : userAuthoritys) {
				authorities.add(authorityMapper.selectByPrimaryKey(userAuthority.getAuthorityId()));
			}
			return authorities;
		} catch (Exception e) {
			System.out.println(e);
			throw new DataAccessResourceFailureException("Data base err");
		}
	}

}
