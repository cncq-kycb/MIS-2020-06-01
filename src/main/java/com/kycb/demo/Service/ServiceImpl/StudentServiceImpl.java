package com.kycb.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kycb.demo.Dao.EvaluationMapper;
import com.kycb.demo.Pojo.Evaluation;
import com.kycb.demo.Pojo.EvaluationExample;
import com.kycb.demo.Pojo.MyJson;
import com.kycb.demo.Service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	EvaluationMapper evaluationMapper;

	@Override
	public MyJson search(String input, String userId) {
		input = "%" + input + "%";
		EvaluationExample evaluationExample = new EvaluationExample();
		evaluationExample.or().andStuIdEqualTo(userId).andEvaNameLike(input);
		try {
			List<Evaluation> evaluations = evaluationMapper.selectByExampleWithBLOBs(evaluationExample);
			return new MyJson(evaluations, "");
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(500, "数据库出错");
		}
	}

}
