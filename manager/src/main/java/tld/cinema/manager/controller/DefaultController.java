package tld.cinema.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/")
    public String timetable() {
        return "Hello Spring from Docker!";
    }
}
