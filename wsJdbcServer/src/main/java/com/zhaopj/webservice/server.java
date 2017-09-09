package com.zhaopj.webservice;

import javax.xml.ws.Endpoint;

public class server {

	public static void main(String[] args) {
		System.out.println("webservice start");
		HelloWorld helloWorld = new HelloWorld();
		String address = "http://192.168.31.42/sayHello";
		Endpoint.publish(address, helloWorld);
		System.out.println("webservice started");
	}

}
