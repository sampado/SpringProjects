package com.sampa.rest.hateoas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sampa.rest.hateoas.model.Product;
import com.sampa.rest.hateoas.rest.resource.ProductResource;
import com.sampa.rest.hateoas.service.ProductService;

@RestController
@ExposesResourceFor(ProductResource.class)
@RequestMapping("/products")
public class RestProductController {

	@Autowired
	private ProductService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProductResource> getProduct(@PathVariable("id") String id) {
		Product product = service.getProduct(id);

		ProductResource productResource = new ProductResource(product);
		return new ResponseEntity<ProductResource>(productResource, HttpStatus.OK);
	}
}
