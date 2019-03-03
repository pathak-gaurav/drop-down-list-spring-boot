package com.gaurav;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DropDownListSpringBootApplication implements CommandLineRunner {

    private CountryRepository repository;

    public DropDownListSpringBootApplication(CountryRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DropDownListSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();
        Country india = new Country("India");
        Country japan = new Country("Japan");
        Country england = new Country("England");
        List<Country> countries = Arrays.asList(india, england, japan);
        repository.saveAll(countries);
    }
}
