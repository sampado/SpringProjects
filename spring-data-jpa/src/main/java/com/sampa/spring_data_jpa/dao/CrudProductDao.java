package com.sampa.spring_data_jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.sampa.spring_data_jpa.model.Product;

public interface CrudProductDao extends CrudRepository<Product, String> {

}
