package com.bookMyShow.movies.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bookMyShow.movies.models.Movie;
import com.bookMyShow.movies.services.MovieService;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie body){		
		this.movieService.addMovie(body);		
		return new ResponseEntity<Movie>(body , HttpStatus.CREATED);
	}
	
	@GetMapping("/movie")
	public ResponseEntity<Optional<Movie>> getMovie(@RequestParam int  id){			
		Optional<Movie> movie = this.movieService.getMovie(id);
		return new ResponseEntity<Optional<Movie>>(movie , HttpStatus.CREATED);
	}
	
	@DeleteMapping("/movie")
	public ResponseEntity<String> deleteMovie(@RequestParam int  id){			
		this.movieService.deleteMovie(id);
		return new ResponseEntity<String>("Movie deleted Successfully" , HttpStatus.CREATED);
	}
	
	@PatchMapping("/movie/{id}")
	public ResponseEntity<String> updateMovie(@PathVariable(name = "id") int id , @RequestBody Movie movie){			
		this.movieService.updateMovie(id, movie);
		return new ResponseEntity<String>("Movie Updated Successfully" , HttpStatus.CREATED);
	}
}
