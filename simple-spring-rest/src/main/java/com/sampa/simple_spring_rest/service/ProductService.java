package com.sampa.simple_spring_rest.service;

import java.util.List;

import com.sampa.simple_spring_rest.model.Product;

public interface ProductService {

	Product getProduct(String id);

	List<Product> getProducts();

}
