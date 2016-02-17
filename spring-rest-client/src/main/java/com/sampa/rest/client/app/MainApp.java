package com.sampa.rest.client.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sampa.rest.client.dao.UserDao;

public class MainApp {

	private final static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

	public static void main(String[] args) {
		
		UserDao userDao = applicationContext.getBean(UserDao.class);

		System.out.println(userDao.getUserById("sampado"));

	}

}
