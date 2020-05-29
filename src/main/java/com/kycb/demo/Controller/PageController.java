package com.kycb.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping({ "", "/", "/login.html" })
	public String indexPage() {
		return "login";
	}

	@RequestMapping("/login.html?error")
	public String loginError() {
		return "loginFail";
	}

	@RequestMapping("/register.html")
	public String registerPage() {
		return "register";
	}

	// 用户首页
	@RequestMapping("/user/index.html")
	public String userIndexPage(HttpSession session) {
		UserDetails userinfo = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		session.setAttribute("userinfo", userinfo);
		return "/user/index";
	}

	// 管理员首页
	@RequestMapping("/admin/index.html")
	public String adminIndexPage() {
		return "/admin/index";
	}
}
