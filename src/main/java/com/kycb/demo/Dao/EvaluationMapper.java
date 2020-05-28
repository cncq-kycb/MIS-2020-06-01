package com.kycb.demo.Dao;

import com.kycb.demo.Pojo.Evaluation;
import com.kycb.demo.Pojo.EvaluationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EvaluationMapper {
	long countByExample(EvaluationExample example);

	int deleteByExample(EvaluationExample example);

	int deleteByPrimaryKey(String evaId);

	int insert(Evaluation record);

	int insertSelective(Evaluation record);

	List<Evaluation> selectByExampleWithBLOBs(EvaluationExample example);

	List<Evaluation> selectByExample(EvaluationExample example);

	Evaluation selectByPrimaryKey(String evaId);

	int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

	int updateByExampleWithBLOBs(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

	int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

	int updateByPrimaryKeySelective(Evaluation record);

	int updateByPrimaryKeyWithBLOBs(Evaluation record);

	int updateByPrimaryKey(Evaluation record);
}