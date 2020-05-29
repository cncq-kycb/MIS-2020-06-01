package com.kycb.demo.Service;

import org.springframework.stereotype.Service;

import com.kycb.demo.Pojo.MyJson;
import com.kycb.demo.Pojo.Userinfo;

@Service
public interface AdminService {

	// 获取异议申请列表
	MyJson getAuditLogs();

	// 审核异议申请
	MyJson verify(String input, String auditId, Userinfo userinfo);

	// 获取全部异议申请
	MyJson getAllAuditLogs();

}
