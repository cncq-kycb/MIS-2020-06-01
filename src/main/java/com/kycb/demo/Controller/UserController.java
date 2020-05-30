package com.kycb.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kycb.demo.Pojo.Auditlog;
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

	// 获取用户信息
	@PreAuthorize("hasAuthority('ROLE_USER')")
	@GetMapping(value = "/user/getUserinfo")
	@ResponseBody
	public MyJson getUserinfo(HttpSession session) {
		Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
		return new MyJson(userinfo, "");
	}

	// 搜索记录
	@PreAuthorize("hasAuthority('ROLE_USER')")
	@GetMapping("/user/search")
	@ResponseBody
	public MyJson search(String input, HttpSession session) {
		Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
		return userService.search(input, userinfo.getUserId(), userinfo.getUserIdentity());
	}

	// 异议申请
	@PreAuthorize("hasAuthority('ROLE_USER')")
	@PostMapping("/user/audit")
	@ResponseBody
	public MyJson audit(Auditlog auditlog, HttpSession session) {
		Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
		return userService.audit(auditlog, userinfo.getUserId());
	}

}
