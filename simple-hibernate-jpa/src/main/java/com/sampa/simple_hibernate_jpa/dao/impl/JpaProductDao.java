package com.sampa.simple_hibernate_jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sampa.simple_hibernate_jpa.dao.ProductDao;
import com.sampa.simple_hibernate_jpa.model.Product;

public class JpaProductDao extends AbstractJpaDAO<Product> implements ProductDao {

	@PersistenceContext(name = "my-persistence")
	private EntityManager entityManager;

	public List<Product> getProducts() {
		Query query = entityManager.createQuery("from Product");
		List<Product> products = query.getResultList();
		return products;
	}

}
