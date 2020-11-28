package tld.cinema.manager.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import tld.cinema.manager.dto.MovieDetails;
import tld.cinema.manager.enumerations.Certificates;
import tld.cinema.manager.enumerations.Genres;
import tld.cinema.manager.model.Customer;
import tld.cinema.manager.model.Movie;
import tld.cinema.manager.repository.CustomerRepository;

@RestController
public class Timetable {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/timetable")
    public List<Movie> timetable() {
        MovieDetails md = new MovieDetails();
        md.setName("The Lord of the Rings: The Fellowship of the Ring");
        md.setRuntime(2 * 60 + 58);
        Set<Genres> genre = new HashSet<>();
        genre.add(Genres.ACTION);
        md.setGenres(genre);
        md.setCertificate(Certificates.PG_13);

        List<Movie> movies = new ArrayList<>();
        movies.add(Movie.instanceOf(md));

        // Customer customer = new Customer();
        // customer.setEmail("customer@domain.tld");
        // customer.setUsername("customer");

        // customerRepository.save(customer);

        return movies;
    }
}
