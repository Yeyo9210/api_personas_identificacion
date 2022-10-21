package com.springcode.personasidentificaciones.controller;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.services.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/identification")
public class IdentificationController {

    @Autowired
    private IdentificationService identificationService;

    @PostMapping("/")
    public ResponseEntity<Identification> addIdentification(@RequestBody Identification identification){
        return ResponseEntity.ok(identificationService.addIdentification(identification));
    }

    @PutMapping("/")
    public ResponseEntity<Identification> updatePersons(@RequestBody Identification identification){
        return ResponseEntity.ok(identificationService.updateIdentification(identification));
    }

    @GetMapping("/")
    public ResponseEntity<Collection<Identification>> listIdentification(){
        return ResponseEntity.ok(identificationService.listIdentifications());
    }

    @GetMapping("/{id}")
    public Optional<Identification> findPersons(@PathVariable("id") long id){
        return identificationService.findIdentificationForId(id);
    }

    @DeleteMapping("/{id}")
    public void deletePersons(@PathVariable("id") long id){
        identificationService.deleteIdentification(id);
    }
}
