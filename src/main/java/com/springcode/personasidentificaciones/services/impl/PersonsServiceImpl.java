package com.springcode.personasidentificaciones.services.impl;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.entity.Persons;
import com.springcode.personasidentificaciones.repositories.PersonsRepository;
import com.springcode.personasidentificaciones.services.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PersonsServiceImpl implements PersonsService {

    @Autowired
    private PersonsRepository personsRepository;

    @Override
    public Persons addPersons(Persons persons) {
        return personsRepository.save(persons);
    }

    @Override
    public Persons updatePersons(Persons persons) {
        return personsRepository.save(persons);
    }

    @Override
    public Set<Persons> listPersons() {
        return new HashSet<>(personsRepository.findAll());
    }

    @Override
    public Persons listPerson(Long id) {
        return personsRepository.findById(id).get();
    }

    @Override
    public Set<Identification> findIdentificationForPersons(Long id) {
        return personsRepository.findPersonsById(id);
    }

    @Override
    public void deletePersons(Long id) {
        Persons persons = new Persons();
        persons.setId(id);
        personsRepository.delete(persons);
    }
}
