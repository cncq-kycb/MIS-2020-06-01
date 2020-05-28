package com.kycb.demo.Dao;

import com.kycb.demo.Pojo.Organizations;
import com.kycb.demo.Pojo.OrganizationsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrganizationsMapper {
	long countByExample(OrganizationsExample example);

	int deleteByExample(OrganizationsExample example);

	int deleteByPrimaryKey(String orgId);

	int insert(Organizations record);

	int insertSelective(Organizations record);

	List<Organizations> selectByExample(OrganizationsExample example);

	Organizations selectByPrimaryKey(String orgId);

	int updateByExampleSelective(@Param("record") Organizations record, @Param("example") OrganizationsExample example);

	int updateByExample(@Param("record") Organizations record, @Param("example") OrganizationsExample example);

	int updateByPrimaryKeySelective(Organizations record);

	int updateByPrimaryKey(Organizations record);
}