package com.kycb.demo.Service;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.kycb.demo.Pojo.Userinfo;

@Service
public interface UserService extends UserDetailsService {

	// 获取用户数据
	Userinfo getUser(String username);

	// 获取用户权限
	List<SimpleGrantedAuthority> getAuthorities(String userId);

}
