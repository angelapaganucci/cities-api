package com.github.angelapaganucci.citiesapi.countries.repositories;

import com.github.angelapaganucci.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
