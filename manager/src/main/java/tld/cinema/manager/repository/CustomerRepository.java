package tld.cinema.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.cinema.manager.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
