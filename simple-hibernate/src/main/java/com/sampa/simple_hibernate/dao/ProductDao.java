package com.sampa.simple_hibernate.dao;

import java.util.List;

import com.sampa.simple_hibernate.model.Product;

public interface ProductDao {

	List<Product> getProducts();

}
