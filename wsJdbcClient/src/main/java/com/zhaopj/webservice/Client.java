package com.zhaopj.webservice;

public class Client {

	public static void main(String[] args) {
		HelloWorldService service = new HelloWorldService();
		HelloWorld helloWorld = service.getHelloWorldPort();
		System.out.println(helloWorld.say("zhaopj"));
	}

}
