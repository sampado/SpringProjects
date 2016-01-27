package com.sampa.simple_hibernate_jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sampa.simple_hibernate_jpa.dao.ProductDao;
import com.sampa.simple_hibernate_jpa.model.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ProductDao dao = (ProductDao) context.getBean("productDao");

		for (Product product : dao.getProducts()) {
			System.out.println("Product -> id: " + product.getId() + " name: " + product.getName());
		}
	}
}
