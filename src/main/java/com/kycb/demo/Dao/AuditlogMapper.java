package com.kycb.demo.Dao;

import com.kycb.demo.Pojo.Auditlog;
import com.kycb.demo.Pojo.AuditlogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuditlogMapper {
	long countByExample(AuditlogExample example);

	int deleteByExample(AuditlogExample example);

	int deleteByPrimaryKey(String auditId);

	int insert(Auditlog record);

	int insertSelective(Auditlog record);

	List<Auditlog> selectByExample(AuditlogExample example);

	Auditlog selectByPrimaryKey(String auditId);

	int updateByExampleSelective(@Param("record") Auditlog record, @Param("example") AuditlogExample example);

	int updateByExample(@Param("record") Auditlog record, @Param("example") AuditlogExample example);

	int updateByPrimaryKeySelective(Auditlog record);

	int updateByPrimaryKey(Auditlog record);
}