package com.cgc.shop.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
public class TestService {
	@Resource
	private SessionFactory sessionFactory;
	
	@Transactional
	public void saveTwoUser() {
		Session session = sessionFactory.getCurrentSession();
		session.save(new User("1", "cgc"));
		session.save(new User("3", "cgckkk"));
	}
}
