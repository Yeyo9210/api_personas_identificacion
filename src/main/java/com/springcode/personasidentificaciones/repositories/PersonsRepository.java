package com.springcode.personasidentificaciones.repositories;


import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonsRepository extends JpaRepository<Persons,Long> {
    Set<Identification> findPersonsById(Long id);
}
