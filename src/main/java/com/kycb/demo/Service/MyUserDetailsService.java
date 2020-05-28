package com.kycb.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kycb.demo.Pojo.Authority;
import com.kycb.demo.Pojo.UserAuthority;
import com.kycb.demo.Pojo.Userinfo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 从数据库查询用户信息
		Userinfo userInfo = userService.getUser(username);
		if (userInfo == null) {
			throw new UsernameNotFoundException("用户不存在！");
		}
		// 查询权限信息
		List<SimpleGrantedAuthority> simpleGrantedAuthorities = createAuthorities(
				userService.getAuthorities(userInfo.getUserId()));
		return new User(username, userInfo.getUserPwd(), simpleGrantedAuthorities);
	}

	private List<SimpleGrantedAuthority> createAuthorities(List<Authority> authorities) {
		List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
		for (Authority authority : authorities) {
			simpleGrantedAuthorities.add(new SimpleGrantedAuthority(authority.getAuthorityName()));
		}
		return simpleGrantedAuthorities;
	}

}
