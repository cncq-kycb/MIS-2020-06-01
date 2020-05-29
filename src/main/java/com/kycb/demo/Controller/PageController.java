package com.kycb.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kycb.demo.Pojo.Userinfo;
import com.kycb.demo.Service.UserService;

@Controller
public class PageController {

	@Autowired
	UserService userService;

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
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Userinfo userinfo = userService.getUser(userDetails.getUsername());
		session.setAttribute("userinfo", userinfo);
		return "/user/index";
	}
	
	@RequestMapping("/user/assetcheck.html")
	public String UserAssetcheckPage() {
		return "/user/assetcheck";
	}


	// 管理员首页
	@RequestMapping("/admin/index.html")
	public String adminIndexPage(HttpSession session) {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Userinfo userinfo = userService.getUser(userDetails.getUsername());
		session.setAttribute("userinfo", userinfo);
		return "/admin/index";
	}
}
