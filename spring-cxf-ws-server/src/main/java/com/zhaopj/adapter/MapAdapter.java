package com.zhaopj.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.zhaopj.entity.MyRole;
import com.zhaopj.entity.Role;

/**
 * Map适配器
 * @author Administrator
 *	
 *	使用适配器，把cxf不能接受的类型通过适配器，转能接受的类型
 *	这里的话XmlAdapter要加两个参数，XmlAdapter<ValueType,BoundType> 
 *		ValueType是cxf能接收的类型，这里我用了数组
 *		BoundType是cxf不能接受的类型，也就是我例子里的需求的Map类型
 */
public class MapAdapter extends XmlAdapter<MyRole[], Map<String, List<Role>>> {

	/**
     * 适配转换  Map<String, List<Role>> -> MyRole[]
     */
	@Override
	public MyRole[] marshal(Map<String, List<Role>> arg0) throws Exception {
		MyRole[] myRole = new MyRole[arg0.size()];
		int i = 0;
		for (String key : arg0.keySet()) {
			myRole[i] = new MyRole(key, arg0.get(key));
			i++;
		}
		return myRole;
	}

	/**
     * 适配转换  MyRole[] -> Map<String, List<Role>>
     */
	@Override
	public Map<String, List<Role>> unmarshal(MyRole[] arg0) throws Exception {
		Map<String, List<Role>> map = new HashMap<String, List<Role>>();
		for (MyRole m : arg0) {
			map.put(m.getKey(), m.getValue());
		}
		return map;
	}

}
