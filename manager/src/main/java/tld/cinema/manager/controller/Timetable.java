package tld.cinema.manager.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tld.cinema.manager.dto.MovieDetails;
import tld.cinema.manager.enumerations.Certificates;
import tld.cinema.manager.enumerations.Genres;
import tld.cinema.manager.model.Movie;

@RestController
public class Timetable {
    @GetMapping("/timetable")
    public List<Movie> timetable() {
        MovieDetails md = new MovieDetails();
        md.setName("The Lord of the Rings: The Fellowship of the Ring");
        md.setRuntime(2 * 60 + 58);
        // Set<Genres> genre = new HashSet<Genres>();
        // genre.add(Genres.ACTION);
        // md.setGenres(genre);
        // md.setSertificate(Certificates.PG_13);

        List<Movie> movies = new ArrayList<>();
        movies.add(Movie.instanceOf(md));

        return movies;
    }
}
