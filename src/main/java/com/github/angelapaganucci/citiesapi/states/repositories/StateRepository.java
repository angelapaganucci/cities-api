package com.github.angelapaganucci.citiesapi.states.repositories;

import com.github.angelapaganucci.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
