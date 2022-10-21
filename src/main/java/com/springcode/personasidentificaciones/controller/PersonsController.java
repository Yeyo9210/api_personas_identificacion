package com.springcode.personasidentificaciones.controller;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.entity.Persons;
import com.springcode.personasidentificaciones.services.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonsController {

    @Autowired
    private PersonsService personsService;

    @PostMapping("/")
    public ResponseEntity<Persons> addPersons(@RequestBody Persons persons){
        return ResponseEntity.ok(personsService.addPersons(persons));
    }

    @PutMapping("/")
    public ResponseEntity<Persons> updatePersons(@RequestBody Persons persons){
        return ResponseEntity.ok(personsService.updatePersons(persons));
    }

    @GetMapping("/")
    public ResponseEntity<Collection<Persons>> listPersons(){
        return ResponseEntity.ok(personsService.listPersons());
    }

    @GetMapping("/{id}")
    public Optional<Persons> findPersons(@PathVariable("id") long id){
        return personsService.findPersonsForId(id);
    }

    @GetMapping("/{id}/identification")
    public ResponseEntity<Collection<Identification>> listIdentificationsPersons(@PathVariable long id){
        Optional<Persons> persons = personsService.findPersonsForId(id);
            return ResponseEntity.ok(persons.get().getIdentifications());
    }

    @DeleteMapping("/{id}")
    public void deletePersons(@PathVariable("id") long id){
        personsService.deletePersons(id);
    }
}
