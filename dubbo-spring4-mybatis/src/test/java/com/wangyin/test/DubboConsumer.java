package com.wangyin.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangyin.domain.User;
import com.wangyin.service.IUserService;

public class DubboConsumer {
	public static void main(String args[]){
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
	        context.start();
	 
	        IUserService demoService = (IUserService)context.getBean("userService"); // ��ȡԶ�̷������
	        List<User> users = demoService.getAllUsers(); // ִ��Զ�̷���
	        for(User user : users){
	        	System.out.println(user.getUserId());
	        }
	}
}
