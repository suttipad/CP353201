// นายสุทธิภัทร รสหอม 663380241-1 sec: 1
package com.sqa.data.stub;

import java.util.Arrays;
import java.util.List;

import com.sqa.api.MovieService;
 
public class MovieServiceStub implements MovieService {
	
	public List<String> getMovieCatalogue(String username, String typeMovie) {
		return Arrays.asList("Spectral (Action)", 
				"13 Hours: The Secret Soldiers of Benghazi (Action)", 
				"Top Gun: Maverick (Action)",
				"Battle Los Angeles (2011) (Action)",
				"Robocop (2014) (Action)");
	}

}