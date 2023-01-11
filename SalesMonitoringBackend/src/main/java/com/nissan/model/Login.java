package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="login")
public class Login {
	//declare column fields
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer loginId;
	private String userName;
	private String password;
	private String userType;
	public Login(Integer loginId, String userName, String password, String userType) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getLoginId() {
		return loginId;
	}
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
}