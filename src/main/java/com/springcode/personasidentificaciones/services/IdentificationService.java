package com.springcode.personasidentificaciones.services;

import com.springcode.personasidentificaciones.entity.Identification;

import java.util.Collection;
import java.util.Optional;

public interface IdentificationService {
    Identification addIdentification(Identification identification);
    Identification updateIdentification(Identification identification);
    Collection<Identification> listIdentifications();

    Optional<Identification> findIdentificationForId(long id);
    void deleteIdentification(long id);

}
