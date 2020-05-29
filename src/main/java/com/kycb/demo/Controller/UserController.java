package com.kycb.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kycb.demo.Pojo.MyJson;
import com.kycb.demo.Pojo.Userinfo;
import com.kycb.demo.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// 获取可选学校
	@GetMapping(value = "/getAllOrganizations")
	@ResponseBody
	public MyJson getAllOrganizations() {
		return userService.getAllOrganizations();
	}

	// 新用户注册
	@PostMapping(value = "/register")
	@ResponseBody
	public MyJson insertUser(Userinfo userinfo) {
		return userService.register(userinfo);
	}
}
