package com.sampa.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sampa.spring.boot.model.Product;
import com.sampa.spring.boot.resource.ProductResource;
import com.sampa.spring.boot.service.ProductService;

@RestController
@RequestMapping("/products")
public class RestProductController {

	@Autowired
	private ProductService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProductResource>> getProducts() {

		List<Product> products = service.getProducts();

		List<ProductResource> productResources = new ArrayList<ProductResource>(products.size());
		for (Product product : products) {
			productResources.add(new ProductResource(product));
		}
		
		return new ResponseEntity<List<ProductResource>>(productResources, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProductResource> getProduct(@PathVariable("id") String id) {
		Product product = service.getProduct(id);
		
		ProductResource productResource = new ProductResource(product);
		return new ResponseEntity<ProductResource>(productResource, HttpStatus.OK);
	}

}
