package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.UserInfo;
import com.example.demo.repository.UserInfoRepository;
import com.example.demo.vo.UserInfoVO;

@Service
public class LoginService {
	
	@Autowired
	private UserInfoRepository repository;
	
	public String login(UserInfoVO params) {
		List<UserInfo> userList = repository.findAll(params);
		if(userList.isEmpty()) {
			return "用户名和密码错误";
		}
		return "登陆成功";
	}
   
}
