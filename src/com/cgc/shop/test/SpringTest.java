package com.cgc.shop.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	private ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void testSessionFactory() {
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
	
	@Test
	public void testService() {
		TestService testService = (TestService) ac.getBean("testService");
		testService.saveTwoUser();
	}
}
