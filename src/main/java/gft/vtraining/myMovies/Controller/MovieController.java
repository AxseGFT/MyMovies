package gft.vtraining.myMovies.Controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import gft.vtraining.myMovies.Entities.Genres;
import gft.vtraining.myMovies.Services.MovieService;


@RestController
public class MovieController {
	
	 @Autowired
	    MovieService movieService;
	    @GetMapping("api/genre/movie/list")
	    public List<Genres> getAllGenres() throws IOException {

	        return movieService.findAllGenreMovieList();
	    }
}
