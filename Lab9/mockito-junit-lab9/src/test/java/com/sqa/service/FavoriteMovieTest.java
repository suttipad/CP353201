// นายสุทธิภัทร รสหอม 663380241-1 sec: 1
package com.sqa.service;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sqa.api.MovieService;
import com.sqa.data.stub.MovieServiceStub;

class FavoriteMovieTest {

	@Test
	void FavoriteMovie() {
		MovieService moviecatalogueservice = new MovieServiceStub();
		FavoriteMovie moviecatalogue = new FavoriteMovie (moviecatalogueservice);
		
		List<String> movielist = moviecatalogue.getMovie("suttipad","Action");
		
		assertEquals(5, movielist.size());		
	}
}