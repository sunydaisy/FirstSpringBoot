package com.example.demo.vo;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserInfoVO {
	
	@NotBlank(message="账户不能为空")
	private String userName;
	
	@NotBlank(message="密码不能为空")
	private String passWord;
   
}
