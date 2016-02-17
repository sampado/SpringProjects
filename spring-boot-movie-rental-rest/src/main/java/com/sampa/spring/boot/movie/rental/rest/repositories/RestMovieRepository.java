package com.sampa.spring.boot.movie.rental.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sampa.spring.boot.movie.rental.rest.model.Movie;

public interface RestMovieRepository extends CrudRepository<Movie, String> {

}
