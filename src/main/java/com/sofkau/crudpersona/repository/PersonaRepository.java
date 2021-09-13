package com.sofkau.crudpersona.repository;

import com.sofkau.crudpersona.domain.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
