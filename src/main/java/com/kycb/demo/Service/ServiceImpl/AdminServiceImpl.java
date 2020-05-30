package com.kycb.demo.Service.ServiceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Component;

import com.kycb.demo.Dao.AuditLogViewMapper;
import com.kycb.demo.Dao.AuditlogMapper;
import com.kycb.demo.Pojo.AuditLogViewExample;
import com.kycb.demo.Pojo.Auditlog;
import com.kycb.demo.Pojo.AuditlogExample;
import com.kycb.demo.Pojo.MyJson;
import com.kycb.demo.Pojo.Userinfo;
import com.kycb.demo.Service.AdminService;

@Component
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AuditlogMapper auditlogMapper;
	@Autowired
	private AuditLogViewMapper auditLogViewMapper;

	@Override
	public MyJson getAuditLogs() {
		AuditLogViewExample auditLogViewExample = new AuditLogViewExample();
		auditLogViewExample.or().andAuditResultEqualTo(0);
		try {
			return new MyJson(auditLogViewMapper.selectByExampleWithBLOBs(auditLogViewExample), "");
		} catch (Exception e) {
			System.out.println(e);
			throw new DataAccessResourceFailureException("Data base err");
		}
	}

	@Override
	public MyJson verify(String input, String auditId, Userinfo userinfo) {
		Auditlog auditlog = new Auditlog();
		auditlog.setAuditId(auditId);
		auditlog.setAuditAdminid(userinfo.getUserId());
		auditlog.setAuditAdminname(userinfo.getUserName());
		if (input.contains("不通过")) {
			auditlog.setAuditResult(2);
		} else {
			auditlog.setAuditResult(1);
		}
		auditlog.setAuditReason(input);
		auditlog.setAuditDate(new Date());
		try {
			auditlogMapper.updateByPrimaryKeySelective(auditlog);
			return new MyJson(100, "审核完成");
		} catch (Exception e) {
			System.out.println(e);
			throw new DataAccessResourceFailureException("Data base err");
		}
	}

	@Override
	public MyJson getAllAuditLogs() {
		AuditLogViewExample auditLogViewExample = new AuditLogViewExample();
		auditLogViewExample.or().andAuditResultNotEqualTo(0);
		try {
			return new MyJson(auditLogViewMapper.selectByExampleWithBLOBs(auditLogViewExample), "");
		} catch (Exception e) {
			System.out.println(e);
			throw new DataAccessResourceFailureException("Data base err");
		}
	}

}
