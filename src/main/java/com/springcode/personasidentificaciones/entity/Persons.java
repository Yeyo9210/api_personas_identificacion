package com.springcode.personasidentificaciones.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "persons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private long id;

    @NotEmpty
    private String name;
    @NotNull
    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String code;

    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date createdAt;

    /*
    Se realiza la relación muchos a muchos
    Se crea una tabla intermedia (JoinTable) donde se una el id de la persona y el id
    de la identificacion
    JsonBackReference nos sirve para evitar la creación de bucles infinitos o recusrsividad y tambien para
    evitar que se serialice
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinTable(name = "persons_identifications",joinColumns = @JoinColumn(name = "person_id",
    referencedColumnName = "person_id"), inverseJoinColumns = @JoinColumn(name = "identification_id",
    referencedColumnName = "identification_id"))
    private Set<Identification> identifications = new HashSet<>();

    public Persons(long id, String name, int age, Gender gender, String code, Date createdAt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.code = code;
        this.createdAt = createdAt;
    }
}
