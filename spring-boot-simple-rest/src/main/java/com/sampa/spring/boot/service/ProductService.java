package com.sampa.spring.boot.service;

import java.util.List;

import com.sampa.spring.boot.model.Product;

public interface ProductService {

	Product getProduct(String id);

	List<Product> getProducts();

}
