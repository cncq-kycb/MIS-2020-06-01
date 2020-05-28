package com.kycb.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kycb.demo.Pojo.Authority;
import com.kycb.demo.Pojo.Userinfo;

@Service
public interface UserService {

	// 获取用户数据
	Userinfo getUser(String username);

	// 获取用户权限
	List<Authority> getAuthorities(String userId);

}
