package com.zhaopj.webservice;

import java.util.List;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.zhaopj.interceptor.HeaderInterceptor;

/**
 * 调用webservice（添加日志拦截器、添加自定义拦截器）
 * @author Administrator
 *
 */
public class Client4 {

	public static void main(String[] args) {
		MyWebServiceService service = new MyWebServiceService();
		MyWebService myWebService = service.getMyWebServicePort();
		//
		org.apache.cxf.endpoint.Client client = ClientProxy.getClient(myWebService);
		//创建in拦截器 日志拦截器
		client.getInInterceptors().add(new LoggingInInterceptor());
		//创建out拦截器 自定义拦截器
		client.getOutInterceptors().add(new HeaderInterceptor("admin", "admin"));
		//创建out拦截器 日志拦截器
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		MyRoleArray myRoleArray = myWebService.getRoles();
		List<MyRole> myRoleList = myRoleArray.item;
		for(MyRole m : myRoleList) {
			for(Role r : m.getValue()) {
				System.out.println(m.getKey() + ":[" + r.getRoleId() + "-" + r.getRoleName() + "]");
			}
		}
	}

}
