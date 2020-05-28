package com.kycb.demo.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@PreAuthorize("hasAuthority('ROLE_USER')")
	@GetMapping("/test1")
	@ResponseBody
	public String test1() {
		return "test1";
	}

}
