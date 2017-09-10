package com.zhaopj.webservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.springframework.stereotype.Component;

import com.zhaopj.adapter.MapAdapter;
import com.zhaopj.entity.Role;
import com.zhaopj.entity.User;

@Component("myWs")
@WebService
public class MyWebService {

	public String helloWorld(String arg0) {
		return "hello world : " + arg0;
	}
	
	public List<Role> getRolesByUser(User user) {
		List<Role> roleList = new ArrayList<Role>();
		if(user != null) {
			if(user.getUserName().equals("admin")) {
				Role role1 = new Role(1,"系统管理员");
				Role role2 = new Role(2,"系统操作员");
				roleList.add(role1);
				roleList.add(role2);
			}else if(user.getUserName().equals("user")) {
				Role role3 = new Role(3,"普通用户");
				roleList.add(role3);
			}
		}
		return roleList;
	}
	
	@XmlJavaTypeAdapter(MapAdapter.class)
	public Map<String, List<Role>> getRoles(){
		Map<String, List<Role>> map = new HashMap<String, List<Role>>();
		List<Role> list1 = new ArrayList<Role>();
		Role role1 = new Role(1,"系统管理员");
		Role role2 = new Role(2,"系统操作员");
		list1.add(role1);
		list1.add(role2);
		map.put("admin", list1);
		List<Role> list2 = new ArrayList<Role>();
		Role role3 = new Role(3,"普通用户");
		list2.add(role3);
		map.put("user", list2);
		return map;
	}

}
