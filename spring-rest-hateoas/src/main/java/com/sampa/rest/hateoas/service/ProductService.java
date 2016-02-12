package com.sampa.rest.hateoas.service;

import java.util.List;

import com.sampa.rest.hateoas.model.Product;

public interface ProductService {

	Product getProduct(String id);

	List<Product> getProducts();

}
