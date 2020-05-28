package com.kycb.demo.Dao;

import com.kycb.demo.Pojo.Authority;
import com.kycb.demo.Pojo.AuthorityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthorityMapper {
	long countByExample(AuthorityExample example);

	int deleteByExample(AuthorityExample example);

	int deleteByPrimaryKey(Integer authorityId);

	int insert(Authority record);

	int insertSelective(Authority record);

	List<Authority> selectByExample(AuthorityExample example);

	Authority selectByPrimaryKey(Integer authorityId);

	int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityExample example);

	int updateByExample(@Param("record") Authority record, @Param("example") AuthorityExample example);

	int updateByPrimaryKeySelective(Authority record);

	int updateByPrimaryKey(Authority record);
}