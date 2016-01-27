package com.sampa.simple_hibernate_jpa.dao;

import java.util.List;

import com.sampa.simple_hibernate_jpa.model.Product;

public interface ProductDao {
	List<Product> getProducts();
}
