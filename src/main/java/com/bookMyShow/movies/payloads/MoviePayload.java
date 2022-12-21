package com.bookMyShow.movies.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MoviePayload {
	private int id;
	private String name;
	private int duration;	
	private String releaseDate;
	private String description;

}
