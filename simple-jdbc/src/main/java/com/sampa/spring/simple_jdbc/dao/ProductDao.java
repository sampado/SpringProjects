package com.sampa.spring.simple_jdbc.dao;

import java.util.List;

import com.sampa.spring.simple_jdbc.model.Product;

public interface ProductDao {

	List<Product> getProducts();

}
