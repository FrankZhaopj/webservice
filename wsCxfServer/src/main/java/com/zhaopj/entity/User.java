package com.zhaopj.entity;

public class User {

	private Integer userId;
	private String userName;

	public User() {
		super();
	}

	public User(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
