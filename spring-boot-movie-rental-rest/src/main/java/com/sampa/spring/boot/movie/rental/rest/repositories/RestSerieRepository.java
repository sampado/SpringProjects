package com.sampa.spring.boot.movie.rental.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sampa.spring.boot.movie.rental.rest.model.Serie;

public interface RestSerieRepository extends CrudRepository<Serie, String> {

}
