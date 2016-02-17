package com.sampa.rest.client.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.sampa.rest.client.model.User;

@Repository
public class RestUserDao implements UserDao {

	private static final String BASE_URL = "https://api.github.com/users/";

	@Autowired
	private RestTemplate restTemplate;

	public User getUserById(String id) {
		String url = new StringBuilder(BASE_URL).append(id).toString();
		ResponseEntity<User> response = restTemplate.getForEntity(url, User.class);
		if (HttpStatus.OK.equals(response.getStatusCode())) {
			return response.getBody();
		}

		return null;
	}
}
