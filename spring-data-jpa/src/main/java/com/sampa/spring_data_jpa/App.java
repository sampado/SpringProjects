package com.sampa.spring_data_jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sampa.spring_data_jpa.dao.CrudProductDao;
import com.sampa.spring_data_jpa.dao.JpaRepoProductDao;
import com.sampa.spring_data_jpa.model.Product;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		JpaRepoProductDao jpaDao = (JpaRepoProductDao) context.getBean(JpaRepoProductDao.class);

		for (Product product : jpaDao.findAll()) {
			System.out.println("Product -> id: " + product.getId() + " name: " + product.getName());
		}
		
		CrudProductDao crudDao = context.getBean(CrudProductDao.class);
		
		Product newProduct = new Product();
		newProduct.setName("New Ticket 5 Days!");
		crudDao.save(newProduct);
		
		for (Product product : crudDao.findAll()) {
			System.out.println("Product -> id: " + product.getId() + " name: " + product.getName());
		}
	}
}
