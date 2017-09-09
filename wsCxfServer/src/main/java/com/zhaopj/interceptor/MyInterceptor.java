package com.zhaopj.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 自定义拦截器
 * 
 * @author Administrator
 *
 */
public class MyInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	public MyInterceptor(String phase) {
		super(phase);
	}

	 public MyInterceptor() {
		 super(Phase.PRE_INVOKE);
	 }

	/**
	 * 拦截获取消息
	 */
	public void handleMessage(SoapMessage msg) throws Fault {
		List<Header> list = msg.getHeaders();
		if (list == null || list.size() == 0) {
			throw new Fault(new IllegalArgumentException("没有Header，拦截器实施拦截"));
		}
		Header firstHeader = list.get(0);
		Element ele = (Element) firstHeader.getObject();
		NodeList usernames = ele.getElementsByTagName("username");
		NodeList passwords = ele.getElementsByTagName("password");
		if (usernames.getLength() != 1) {
			throw new Fault(new IllegalArgumentException("用户名格式不对"));
		}
		if (passwords.getLength() != 1) {
			throw new Fault(new IllegalArgumentException("密码格式不对"));
		}
		String username = usernames.item(0).getTextContent();
		String password = passwords.item(0).getTextContent();
		if (!username.equals("admin") || !password.equals("admin")) {
			throw new Fault(new IllegalArgumentException("用户名或者密码不正确"));
		}
	}

}
