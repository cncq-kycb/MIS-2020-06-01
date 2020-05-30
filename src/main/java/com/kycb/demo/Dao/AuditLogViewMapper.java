package com.kycb.demo.Dao;

import com.kycb.demo.Pojo.AuditLogView;
import com.kycb.demo.Pojo.AuditLogViewExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuditLogViewMapper {
	long countByExample(AuditLogViewExample example);

	int deleteByExample(AuditLogViewExample example);

	int insert(AuditLogView record);

	int insertSelective(AuditLogView record);

	List<AuditLogView> selectByExampleWithBLOBs(AuditLogViewExample example);

	List<AuditLogView> selectByExample(AuditLogViewExample example);

	int updateByExampleSelective(@Param("record") AuditLogView record, @Param("example") AuditLogViewExample example);

	int updateByExampleWithBLOBs(@Param("record") AuditLogView record, @Param("example") AuditLogViewExample example);

	int updateByExample(@Param("record") AuditLogView record, @Param("example") AuditLogViewExample example);
}