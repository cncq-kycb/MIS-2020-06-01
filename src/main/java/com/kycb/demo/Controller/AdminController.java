package com.kycb.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kycb.demo.Pojo.MyJson;
import com.kycb.demo.Pojo.Userinfo;
import com.kycb.demo.Service.AdminService;

@RestController
public class AdminController {

	@Autowired
	AdminService adminService;

	// 获取待处理异议申请
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping(value = "/admin/getAuditLogs")
	@ResponseBody
	public MyJson getAuditLogs() {
		return adminService.getAuditLogs();
	}

	// 获取全部异议申请
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping(value = "/admin/getAllAuditLogs")
	@ResponseBody
	public MyJson getAllAuditLogs() {
		return adminService.getAllAuditLogs();
	}

	// 审核异议申请
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@PostMapping(value = "/admin/verify")
	@ResponseBody
	public MyJson verify(String input, String auditId, HttpSession session) {
		Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
		return adminService.verify(input, auditId, userinfo);
	}
	
	// 获取用户信息
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping(value = "/admin/getUserinfo")
	@ResponseBody
	public MyJson getUserinfo(HttpSession session) {
		Userinfo userinfo = (Userinfo) session.getAttribute("userinfo");
		return new MyJson(userinfo, "");
	}

}
