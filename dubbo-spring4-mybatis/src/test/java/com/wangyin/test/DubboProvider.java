package com.wangyin.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProvider {
	public static void main(String[] args) throws IOException{
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(
						new String[]{"classpath:dubbo-provider.xml",
								"classpath:spring.xml",
								"classpath:spring-mybatis.xml"});
		context.start();
		
		System.in.read();
		/*com.alibaba.dubbo.container.Main.main(args);*/
	}
}
