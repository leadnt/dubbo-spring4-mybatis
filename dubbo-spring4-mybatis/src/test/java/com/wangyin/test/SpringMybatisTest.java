package com.wangyin.test;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangyin.domain.User;
import com.wangyin.service.IUserService;

public class SpringMybatisTest extends TestCase{
	private static  IUserService userService;
	private static ApplicationContext act;
	static{
		act = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		userService = (IUserService)act.getBean("userService");
	}
	
	public void testSelectAll(){
		List<User> users = userService.getAllUsers();
		for(User user : users){
			System.out.println(user.getUserId());
		}
	}
	
	public void testSelectById(){
		User user = userService.getUserById("be44848deae94501a34c182bdcb4a4de");
		System.out.println(user.getUserBirthday());
	}
	public void testAdd(){
		User user = new User();
		user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setUserBirthday(new Date());
		user.setUserName("wudi");
		user.setUserSalary(15000D);
		userService.addUser(user);
		
	}
}
