package com.icai.controller;

import org.junit.Test;

import com.icai.pojo.User;
import com.icai.service.UserService;
import com.icai.service.impl.UserServiceImpl;

public class MyTest {
	
	@Test
	public void demo() {
		//接收页面请求
		User user = new User();
		UserService userService = new UserServiceImpl();
		System.out.println("controller层 接受页面传递过来的数据并且调用服务层 程序员1");
		userService.addUser(user);
		System.out.println("把结果发送到jsp 页面");
	}
}
