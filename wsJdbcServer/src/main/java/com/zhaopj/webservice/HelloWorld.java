package com.zhaopj.webservice;

import javax.jws.WebService;

@WebService
public class HelloWorld {

	public String say(String args) {
		return "hello world : " + args;
	}

}
