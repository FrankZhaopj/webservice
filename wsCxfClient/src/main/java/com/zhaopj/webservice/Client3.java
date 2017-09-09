package com.zhaopj.webservice;

import java.util.List;

/**
 * 调用webservice（复杂（cxf不支持）数据类型）
 * @author Administrator
 *
 */
public class Client3 {

	public static void main(String[] args) {
		MyWebServiceService service = new MyWebServiceService();
		MyWebService myWebService = service.getMyWebServicePort();
		MyRoleArray myRoleArray = myWebService.getRoles();
		List<MyRole> myRoleList = myRoleArray.item;
		for(MyRole m : myRoleList) {
			for(Role r : m.getValue()) {
				System.out.println(m.getKey() + ":[" + r.getRoleId() + "-" + r.getRoleName() + "]");
			}
		}
	}

}
