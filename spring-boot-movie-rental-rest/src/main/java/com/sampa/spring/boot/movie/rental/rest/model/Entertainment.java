package com.sampa.spring.boot.movie.rental.rest.model;

import java.util.List;

public abstract class Entertainment {

	private String id;
	private String title;
	private String description;
	private String pathCoverImage;
	private Double rating;
	private List<Actor> actors;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPathCoverImage() {
		return pathCoverImage;
	}

	public void setPathCoverImage(String pathCoverImage) {
		this.pathCoverImage = pathCoverImage;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}
