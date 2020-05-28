package com.kycb.demo.Dao;

import com.kycb.demo.Pojo.Userinfo;
import com.kycb.demo.Pojo.UserinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserinfoMapper {
	long countByExample(UserinfoExample example);

	int deleteByExample(UserinfoExample example);

	int deleteByPrimaryKey(String userId);

	int insert(Userinfo record);

	int insertSelective(Userinfo record);

	List<Userinfo> selectByExample(UserinfoExample example);

	Userinfo selectByPrimaryKey(String userId);

	int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

	int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

	int updateByPrimaryKeySelective(Userinfo record);

	int updateByPrimaryKey(Userinfo record);
}