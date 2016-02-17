package com.sampa.spring.boot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sampa.spring.boot.model.Product;
import com.sampa.spring.boot.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static List<Product> products;

	static {
		products = new ArrayList<Product>(3);
		for (int i = 1; i < 4; i++) {
			products.add(generateProduct(Integer.toString(i)));
		}
	}

	public Product getProduct(String id) {
		if (StringUtils.isEmpty(id)) {
			return null;
		}
		for (Product product : products) {
			if (id.equals(product.getId())) {
				return product;
			}
		}
		return null;
	}

	public List<Product> getProducts() {
		return products;
	}

	private static Product generateProduct(String id) {
		Product product = new Product();
		product.setId(id);
		product.setName("Ticket Product " + id);
		return product;
	}

}
