package com.sampa.spring.boot.movie.rental.rest.model;

/**
 * @author sampa
 *
 */
public class Chapter implements Watchable {

	/**
	 * duration in minutes
	 */
	private long duration;
	private int number;
	private String name;

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		String message = new StringBuilder("Watching ").append(name).append(" for ").append(duration)
				.append(" minutes.").toString();
		System.out.println(message);

	}

}
