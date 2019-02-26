package com.example.demo.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.LoginService;
import com.example.demo.vo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/first")
@Slf4j
public class LoginController {
	
	@Autowired
    private LoginService service;
	
	@PostMapping("/login")
	public String login(@Valid @RequestBody UserInfoVO user,BindingResult bindingResult) {
		log.info("请求参数为："+user.toString());
		if(bindingResult.hasErrors()) {
			return "请求参数错误----"+bindingResult.getFieldError().getDefaultMessage();
		}
		return service.login(user);
	}

}
