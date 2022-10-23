package com.springcode.personasidentificaciones.services.impl;

import com.springcode.personasidentificaciones.entity.Identification;
import com.springcode.personasidentificaciones.repositories.IdentificationRepository;
import com.springcode.personasidentificaciones.services.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


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
    public Set<Identification> listIdentifications() {
        return new HashSet<>(identificationRepository.findAll());
    }

    @Override
    public Identification findIdentification(Long id) {
        return identificationRepository.findById(id).get();
    }

    @Override
    public void deleteIdentification(Long id) {
        Identification identification = new Identification();
        identification.setId(id);
        identificationRepository.delete(identification);
    }
}
