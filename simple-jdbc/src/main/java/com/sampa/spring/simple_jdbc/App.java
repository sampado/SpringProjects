package com.sampa.spring.simple_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sampa.spring.simple_jdbc.dao.ProductDao;
import com.sampa.spring.simple_jdbc.model.Product;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("context.xml");

		ProductDao dao = (ProductDao) context.getBean("jdbcProductDao");

		List<Product> products = dao.getProducts();

		for (Product product : products) {
			System.out.println("Product id: " + product.getId() + " name --> " + product.getName());
		}

	}
}
