package com.springcode.personasidentificaciones.services.impl;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.entity.Persons;
import com.springcode.personasidentificaciones.repositories.PersonsRepository;
import com.springcode.personasidentificaciones.services.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

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
    public Collection<Persons> listPersons() {
        return personsRepository.findAll();
    }

    @Override
    public Collection<Identification> findIdentificationForPersons(long id) {
        return personsRepository.findByIdPersons(id);
    }

    @Override
    public Optional<Persons> findPersonsForId(long id) {
        return personsRepository.findById(id);
    }

    @Override
    public void deletePersons(long id) {
        Persons persons = new Persons();
        persons.setId(id);
        personsRepository.delete(persons);
    }
}
