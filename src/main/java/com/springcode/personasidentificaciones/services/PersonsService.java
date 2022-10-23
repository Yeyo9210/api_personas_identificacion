package com.springcode.personasidentificaciones.services;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.entity.Persons;
import java.util.Set;

public interface PersonsService {

    Persons addPersons(Persons persons);
    Persons updatePersons(Persons persons);
    Set<Persons> listPersons();
    Persons listPerson(Long id);
    Set<Identification> findIdentificationForPersons(Long id);
    void deletePersons(Long id);
}
