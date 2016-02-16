package com.sampa.spring_data_mongodb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sampa.spring_data_mongodb.model.Product;
import com.sampa.spring_data_mongodb.repository.ProductRepository;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductRepository repository = context.getBean(ProductRepository.class);

		Product ticket1 = new Product();
		ticket1.setId("1");
		ticket1.setName("Ticket 1 day");

		repository.save(ticket1);

		for (Product product : repository.findAll()) {
			System.out.println(product.toString());
		}
	}
}
