package com.zhaopj.webservice;

import java.util.List;

/**
 * 调用webservice（对象数据类型）
 * @author Administrator
 *
 */
public class Client2 {

	public static void main(String[] args) {
		MyWebServiceService service = new MyWebServiceService();
		MyWebService myWebService = service.getMyWebServicePort();
		User u = new User();
		u.setUserId(1);
		u.setUserName("admin");
//		u.setUserName("user");
//		u.setUserName("abc");
		List<Role> list = myWebService.getRolesByUser(u);
		for(Role r : list){
			System.out.println(r.getRoleId() + ":" + r.getRoleName());
		}
	}

}
