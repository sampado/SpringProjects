package com.sampa.spring.boot.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sampa.spring.boot.controller.RestProductController;
import com.sampa.spring.boot.model.Product;

public class ProductResource extends ResourceSupport {

	private String productId;
	private String name;

	public ProductResource(Product product) {
		super();
		name = product.getName();
		productId = product.getId();
		add(linkTo(methodOn(RestProductController.class, String.class).getProduct(productId)).withSelfRel());
	}

	@JsonProperty("id")
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
