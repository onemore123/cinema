package tld.cinema.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.cinema.manager.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByEmail(String email);
}   
