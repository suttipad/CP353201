// นายสุทธิภัทร รสหอม 663380241-1 sec: 1
package com.sqa.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.sqa.api.MovieService;

class FavoriteMovieMockitoTest {

	@Test
	void testUsingMockito() {
		MovieService moviecatalogueservice = mock(MovieService.class);
		List<String> movielist = Arrays.asList("Spectral (Action)", 
				"13 Hours: The Secret Soldiers of Benghazi (Action)", 
				"Top Gun: Maverick (Action)",
				"Battle Los Angeles (2011) (Action)",
				"Robocop (2014) (Action)");
		
		when(moviecatalogueservice.getMovieCatalogue("suttipad", "Action")).thenReturn(movielist);
		
		FavoriteMovie  moviecatalogue = new FavoriteMovie (moviecatalogueservice);
		List<String> actionmovielist = moviecatalogue.getMovie("suttipad", "Action");
		
		assertEquals(5, actionmovielist.size());		
	}
}