package com.springcode.personasidentificaciones.repositories;

import com.springcode.personasidentificaciones.entity.Persons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PersonsRepository extends CrudRepository<Persons,Long> {

    Collection<Persons> findAll();
}
