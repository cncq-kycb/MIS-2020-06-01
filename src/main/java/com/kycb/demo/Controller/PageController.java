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

	@RequestMapping(value = "/user/index.html")
	public String userIndex() {
		return "user/index";
	}
}
