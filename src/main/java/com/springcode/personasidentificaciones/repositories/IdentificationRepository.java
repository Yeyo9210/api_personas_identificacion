package com.springcode.personasidentificaciones.repositories;

import com.springcode.personasidentificaciones.entity.Identification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface IdentificationRepository extends CrudRepository<Identification,Long> {

    Collection<Identification> findAll();
}
