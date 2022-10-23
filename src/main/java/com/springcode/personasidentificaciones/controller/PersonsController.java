package com.springcode.personasidentificaciones.controller;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.entity.Persons;
import com.springcode.personasidentificaciones.services.IdentificationService;
import com.springcode.personasidentificaciones.services.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/persons")
public class PersonsController {

    @Autowired
    private PersonsService personsService;

    @Autowired
    private IdentificationService identificationService;

    @PostMapping("/")
    public ResponseEntity<Persons> addPersons(@RequestBody Persons persons){
        return ResponseEntity.ok(personsService.addPersons(persons));
    }

    @PutMapping("/")
    public ResponseEntity<Persons> updatePersons(@RequestBody Persons persons){
        return ResponseEntity.ok(personsService.updatePersons(persons));
    }

    @GetMapping("/")
    public ResponseEntity<?> listPersons(){
        return ResponseEntity.ok(personsService.listPersons());
    }

    @GetMapping("/{id}")
    public Persons findPersons(@PathVariable("id") Long id){
        return personsService.listPerson(id);
    }

    @GetMapping("/{id}/identifications")
    public ResponseEntity<Set<Identification>>listIdentificationForPersons(@PathVariable("id") Long id){
        Persons persons = personsService.listPerson(id);
        return new ResponseEntity<>(persons.getIdentifications(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deletePersons(@PathVariable("id") Long id){
        personsService.deletePersons(id);
    }
}
