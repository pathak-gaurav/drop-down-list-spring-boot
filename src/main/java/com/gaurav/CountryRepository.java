package com.gaurav;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country,Long> {

    Country findByCountryName(String name);
}
