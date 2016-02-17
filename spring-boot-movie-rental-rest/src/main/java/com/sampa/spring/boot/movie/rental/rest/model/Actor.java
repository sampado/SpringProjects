package com.sampa.spring.boot.movie.rental.rest.model;

import java.util.Set;

public class Actor {

	private Long id;
	private String name;
	private String lastName;
	private Set<Entertainment> entertainments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Entertainment> getEntertainments() {
		return entertainments;
	}

	public void setEntertainments(Set<Entertainment> entertainments) {
		this.entertainments = entertainments;
	}

}
