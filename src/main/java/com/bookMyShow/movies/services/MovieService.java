package com.bookMyShow.movies.services;

import com.bookMyShow.movies.models.Movie;

import java.util.Optional;

//import com.bookMyShow.movies.payloads.MoviePayload;

public interface MovieService {
	Optional<Movie> getMovie(int id);
	Movie addMovie(Movie movie);
	void deleteMovie(int id);
	void updateMovie(int id, Movie movie);
	
}
