package com.bookMyShow.movies.services.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookMyShow.movies.models.Movie;
import com.bookMyShow.movies.repository.MovieRepository;
import com.bookMyShow.movies.services.MovieService;

@Service
public class MovieServiceImplementaton implements MovieService {
	
	@Autowired
	private MovieRepository movieRepo;

	@Override
	public Optional<Movie> getMovie(int id) {
		// TODO Auto-generated method stub
		return this.movieRepo.findById(id);
	}

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		this.movieRepo.save(movie);		
		return movie;
	}
	

	@Override
	public void deleteMovie(int id) {
		// TODO Auto-generated method stub
		this.movieRepo.deleteById(id);
		
	}

	@Override
	public void updateMovie(int id , Movie movie) {
		// TODO Auto-generated method stub
		this.deleteMovie(id);
		this.addMovie(movie);		
	}

	

	



	
	

}
