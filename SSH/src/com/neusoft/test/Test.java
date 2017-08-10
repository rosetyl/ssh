package com.neusoft.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.bean.User;
import com.neusoft.service.UserService;



public class Test {
	public static void main(String[] args) {
		//���������WEB�����У�����Ҫǰ���д���
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = ctx.getBean("userService",UserService.class);
		
		//����һ��User����
		User user = new User();
		user.setUsername("aaa");
		user.setPassword("111");
		us.saveUser(user);
	}
}
