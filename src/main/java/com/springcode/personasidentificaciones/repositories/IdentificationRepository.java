package com.springcode.personasidentificaciones.repositories;

import com.springcode.personasidentificaciones.entity.Identification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentificationRepository extends JpaRepository<Identification,Long> {
}
