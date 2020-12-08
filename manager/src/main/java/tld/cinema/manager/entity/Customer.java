package tld.cinema.manager.entity;

import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private final Long id;
    private String email;
    private final String username;

    public static class Builder {
        private final String email;
        private final String username;

        public Builder(String email) {
            this.email = email;
        };

        public Builder username(String val) {
            username = val;

            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    private Customer() {}

    private Customer(Builder builder) {
        this.email = builder.email;
        this.username = builder.username;
    }

    public Long id() {
        return this.id;
    }

    public String email() {
        return this.email;
    }

    public String username() {
        return this.username;
    }
}
