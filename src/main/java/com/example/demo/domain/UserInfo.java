package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 用户信息
 * @author yanyaqin
 */
@Entity
@Table(name="user_info")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="pass_word")
	private String passWord;

	@Column(name="user_code")
	private int userCode;

	@Column(name="user_name")
	private String userName;

	public UserInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getUserCode() {
		return this.userCode;
	}

	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}