package com.sampa.spring.simple_jdbc.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sampa.spring.simple_jdbc.dao.ProductDao;
import com.sampa.spring.simple_jdbc.dao.mapper.ProductMapper;
import com.sampa.spring.simple_jdbc.model.Product;

public class JdbcProductDao implements ProductDao {

	private JdbcTemplate jdbcTemplate;

	@Required
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Product> getProducts() {
		return jdbcTemplate.query("select * from product;", new ProductMapper());
	}

}
