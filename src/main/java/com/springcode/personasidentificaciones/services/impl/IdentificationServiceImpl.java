package com.springcode.personasidentificaciones.services.impl;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.entity.Persons;
import com.springcode.personasidentificaciones.repositories.IdentificationRepository;
import com.springcode.personasidentificaciones.services.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class IdentificationServiceImpl implements IdentificationService {

    @Autowired
    private IdentificationRepository identificationRepository;

    @Override
    public Identification addIdentification(Identification identification) {
        return identificationRepository.save(identification);
    }

    @Override
    public Identification updateIdentification(Identification identification) {
        return identificationRepository.save(identification);
    }

    @Override
    public Collection<Identification> listIdentifications() {
        return identificationRepository.findAll();
    }

    @Override
    public Optional<Identification> findIdentificationForId(long id) {
        return identificationRepository.findById(id);
    }

    @Override
    public void deleteIdentification(long id) {
        Identification identification = new Identification();
        identification.setId(id);
        identificationRepository.delete(identification);
    }
}
