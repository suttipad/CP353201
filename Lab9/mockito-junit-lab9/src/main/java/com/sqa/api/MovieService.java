// นายสุทธิภัทร รสหอม 663380241-1 sec: 1
package com.sqa.api;

import java.util.List;

public interface MovieService {
	
	public List<String> getMovieCatalogue(String username, String typeMovie);

}