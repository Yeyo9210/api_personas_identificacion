package com.springcode.personasidentificaciones.services;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.entity.Persons;

import java.util.Collection;
import java.util.Optional;

public interface PersonsService {
    Persons addPersons(Persons persons);
    Persons updatePersons(Persons persons);
    Collection<Persons> listPersons();
    Collection<Identification> findIdentificationForPersons(long id);
    Optional<Persons> findPersonsForId(long id);
    void deletePersons(long id);
}
