package com.sampa.spring.boot.movie.rental.rest.model;

import java.util.List;

public class Serie extends Entertainment {

	private List<Season> seasons;

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	
}
