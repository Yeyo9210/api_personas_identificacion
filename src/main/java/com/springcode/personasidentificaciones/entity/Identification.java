package com.springcode.personasidentificaciones.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "identification")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Identification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identification_id")
    private long id;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    private Ident identificationName;

    @NotEmpty
    private String description;

    @Column(name = "date_idetification")
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date createdAt;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinTable(name = "persons_identifications",joinColumns = @JoinColumn(name = "identification_id",
            referencedColumnName = "identification_id"), inverseJoinColumns = @JoinColumn(name = "person_id",
            referencedColumnName = "person_id"))
    private Set<Persons> persons = new HashSet<>();

    public Identification(long id, Ident identificationName, String description, Date createdAt) {
        this.id = id;
        this.identificationName = identificationName;
        this.description = description;
        this.createdAt = createdAt;
    }
}
