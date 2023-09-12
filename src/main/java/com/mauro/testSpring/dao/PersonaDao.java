package com.mauro.testSpring.dao;

import com.mauro.testSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {
}
