package com.zhaopj.webservice;

/**
 * 调用webservice（java基本数据类型）
 * @author Administrator
 *
 */
public class Client1 {

	public static void main(String[] args) {
		MyWebServiceService service = new MyWebServiceService();
		MyWebService myWebService = service.getMyWebServicePort();
		System.out.println(myWebService.helloWorld("zhaopj"));
	}

}
