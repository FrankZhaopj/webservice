package com.zhaopj.entity;

import java.util.List;

public class MyRole {

	private String key;
	private List<Role> value;

	public MyRole() {
		super();
	}

	public MyRole(String key, List<Role> value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<Role> getValue() {
		return value;
	}

	public void setValue(List<Role> value) {
		this.value = value;
	}

}
