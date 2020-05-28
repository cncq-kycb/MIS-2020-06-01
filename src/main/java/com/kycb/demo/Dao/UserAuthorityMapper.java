package com.kycb.demo.Dao;

import com.kycb.demo.Pojo.UserAuthority;
import com.kycb.demo.Pojo.UserAuthorityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserAuthorityMapper {
	long countByExample(UserAuthorityExample example);

	int deleteByExample(UserAuthorityExample example);

	int insert(UserAuthority record);

	int insertSelective(UserAuthority record);

	List<UserAuthority> selectByExample(UserAuthorityExample example);

	int updateByExampleSelective(@Param("record") UserAuthority record, @Param("example") UserAuthorityExample example);

	int updateByExample(@Param("record") UserAuthority record, @Param("example") UserAuthorityExample example);
}