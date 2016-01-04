package com.sampa.spring.simplest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

	public static void main(String[] args) {

		Product product = (Product) context.getBean("product");

		System.out.println("Product id: " + product.getId());
		System.out.println("Product name: " + product.getName());

	}
}
