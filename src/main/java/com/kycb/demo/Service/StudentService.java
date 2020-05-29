package com.kycb.demo.Service;

import org.springframework.stereotype.Service;

import com.kycb.demo.Pojo.MyJson;

@Service
public interface StudentService {

	// 按评价名和当前账号id搜索记录
	MyJson search(String input, String userId);

}
