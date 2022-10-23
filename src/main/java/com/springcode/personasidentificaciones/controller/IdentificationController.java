package com.springcode.personasidentificaciones.controller;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.services.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    public ResponseEntity<Identification> updateIdentification(@RequestBody Identification identification){
        return ResponseEntity.ok(identificationService.updateIdentification(identification));
    }

    @GetMapping("/")
    public ResponseEntity<?> listIdentification(){
        return ResponseEntity.ok(identificationService.listIdentifications());
    }

    @GetMapping("/{id}")
    public Identification findIdentification(@PathVariable("id") Long id){
        return identificationService.findIdentification(id);
    }

    @DeleteMapping("/{id}")
    public void deleteIdentification(@PathVariable("id") Long id){
        identificationService.deleteIdentification(id);
    }
}
