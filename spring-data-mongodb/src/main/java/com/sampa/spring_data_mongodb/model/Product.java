package com.sampa.spring_data_mongodb.model;

import org.springframework.data.annotation.Id;

public class Product {

	@Id
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Product[id=%s, Name='%s']", id, name);
	}

}
