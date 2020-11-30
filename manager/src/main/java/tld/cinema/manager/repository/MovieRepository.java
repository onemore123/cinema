package tld.cinema.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.cinema.manager.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}   
