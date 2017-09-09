package com.zhaopj.webservice;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.zhaopj.interceptor.MyInterceptor;

public class Server {

	public static void main(String[] args) {
		System.out.println("myWebService start");
		MyWebService myWebService = new MyWebService();
		String address = "http://192.168.31.42:8888/myWs";
		//cxf方式发布webservice
		JaxWsServerFactoryBean jsf = new JaxWsServerFactoryBean();
		jsf.setAddress(address);
		
		jsf.setServiceClass(MyWebService.class);
		//jsf.setServiceBean(myWebService);
		
		//创建in拦截器 日志拦截器
		jsf.getInInterceptors().add(new LoggingInInterceptor());
		//创建out拦截器 日志拦截器
		jsf.getOutInterceptors().add(new LoggingOutInterceptor());
		//创建自定义拦截器 权限认证拦截器
		jsf.getInInterceptors().add(new MyInterceptor());
		//发布
		jsf.create();
		System.out.println("myWebService started");
	}

}
