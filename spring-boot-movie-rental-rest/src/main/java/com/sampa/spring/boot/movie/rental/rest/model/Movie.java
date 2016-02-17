package com.sampa.spring.boot.movie.rental.rest.model;

public class Movie extends Entertainment implements Watchable {

	private Long duration;

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	@Override
	public void play() {
		String message = new StringBuilder("Watching ").append(super.getTitle()).append(" for ").append(duration)
				.append(" minutes.").toString();
		System.out.println(message);
	}
}
