package provider.impl;

import java.util.ArrayList;
import java.util.List;

import provider.DemoService;

/**
 * @Author: neverX2017
 * @Description: 在服务提供方实现接口（对服务消费方隐藏实现）
 */

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List getUsers() {
		List list = new ArrayList();
		User u1 = new User();
		u1.setName("jack");
		u1.setAge(20);
		u1.setSex("m");

		User u2 = new User();
		u2.setName("tom");
		u2.setAge(21);
		u2.setSex("m");

		User u3 = new User();
		u3.setName("rose");
		u3.setAge(19);
		u3.setSex("w");

		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}
}
