package com.example.demo.vo;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoVO {
	
	@NotBlank
	private String userName;
	
	@NotBlank
	private String passWord;
   
}
