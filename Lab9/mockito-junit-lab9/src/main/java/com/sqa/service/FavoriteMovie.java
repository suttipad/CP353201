// นายสุทธิภัทร รสหอม 663380241-1 sec: 1
package com.sqa.service;

import java.util.ArrayList;
import java.util.List;

import com.sqa.api.MovieService;

public class FavoriteMovie  {
	
	private MovieService moviecatalogueservice;
	
	public FavoriteMovie (MovieService moviecatalogueservice) {
		super();
		this.moviecatalogueservice = moviecatalogueservice;
	}
	
	public List<String> getMovie(String username, String typeMovie) {
		List<String> movielist = new ArrayList<String>();
		List<String> allmovielist = moviecatalogueservice.getMovieCatalogue(username, typeMovie);
			
		for (String movie: allmovielist) {
			if (movie.contains(typeMovie)) {
				movielist.add(movie);
			}
		}
		return movielist;
	}
}