package com.kycb.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.kycb.demo.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
}
