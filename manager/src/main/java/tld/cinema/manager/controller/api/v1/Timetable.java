package tld.cinema.manager.controller.api.v1;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import tld.cinema.manager.dto.MovieDetails;
import tld.cinema.manager.enumerations.Certificate;
import tld.cinema.manager.enumerations.Genre;
import tld.cinema.manager.entity.Customer;
import tld.cinema.manager.entity.Movie;
import tld.cinema.manager.repository.CustomerRepository;

@RestController
public class Timetable {
    @Autowired
    private CustomerRepository customerRepository;

//    @GetMapping("/timetable")
//    public List<Movie> timetable() {
//        MovieDetails md = new MovieDetails();
//        md.setName("The Lord of the Rings: The Fellowship of the Ring");
//        md.setRuntime(2 * 60 + 58);
//        Set<Genre> genre = new HashSet<>();
//        genre.add(Genre.ACTION);
//        md.setGenres(genre);
//        md.setCertificate(Certificate.PG_13);
//
//        List<Movie> movies = new ArrayList<>();
//        movies.add(Movie.instanceOf(md));
//
//        Customer customer = new Customer();
//        customer.setEmail("customer@cinema.tld");
//        customerRepository.saveAndFlush(customer);
//
//        return movies;
//    }

    @GetMapping("/customer")
    public Customer customer() {
        Customer customer = customerRepository.findByEmail("customer@cinema.tld");

        return customer;
    }
}
