package com.springcode.personasidentificaciones.services;

import com.springcode.personasidentificaciones.entity.Identification;

import java.util.Set;

public interface IdentificationService {

    Identification addIdentification(Identification identification);
    Identification updateIdentification(Identification identification);
    Set<Identification> listIdentifications();
    Identification findIdentification(Long id);
    void deleteIdentification(Long id);

}
