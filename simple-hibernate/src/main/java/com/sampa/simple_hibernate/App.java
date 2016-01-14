package com.sampa.simple_hibernate;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sampa.simple_hibernate.dao.ProductDao;
import com.sampa.simple_hibernate.model.Product;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ProductDao dao = (ProductDao) context.getBean("hibernateProductDao");

		List<Product> products = dao.getProducts();

		for (Product product : products) {
			System.out.println("Product id: " + product.getId() + " name --> " + product.getName());
		}

	}
}
