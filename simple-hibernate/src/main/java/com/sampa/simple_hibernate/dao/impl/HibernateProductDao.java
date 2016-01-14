package com.sampa.simple_hibernate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.sampa.simple_hibernate.dao.ProductDao;
import com.sampa.simple_hibernate.model.Product;

@Transactional
public class HibernateProductDao implements ProductDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Product> getProducts() {
		List<Product> list = (List<Product>) this.sessionFactory.getCurrentSession()
				.createQuery("from Product").list();
		return list;
	}

}
