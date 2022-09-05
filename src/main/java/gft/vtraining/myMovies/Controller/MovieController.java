package gft.vtraining.myMovies.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}

	@GetMapping("/genres")
	public String getGenres() {
		String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=2cb9386c946854bb3a092c4af0e52ef9&language=es-ES";
		RestTemplate restTemplate = new RestTemplate();
		
		Object[] genres = restTemplate.getForObject(url, Object[].class);
		
		return genres.toString();
	}
}
