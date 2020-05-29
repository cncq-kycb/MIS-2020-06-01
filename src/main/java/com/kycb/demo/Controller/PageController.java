package com.kycb.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/login.html")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/register.html")
	public String registerPage() {
		return "register";
	}

	// 用户首页
	@RequestMapping("/user/index.html")
	public String userIndexPage() {
		return "/user/index";
	}

	// 管理员首页
	@RequestMapping("/admin/index.html")
	public String adminIndexPage() {
		return "/admin/index";
	}
}
