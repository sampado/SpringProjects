package com.sampa.spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampa.spring_data_jpa.model.Product;

public interface JpaRepoProductDao extends JpaRepository<Product, String> {
	
}
