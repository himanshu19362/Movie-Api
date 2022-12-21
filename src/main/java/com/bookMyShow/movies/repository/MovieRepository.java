package com.bookMyShow.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookMyShow.movies.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
