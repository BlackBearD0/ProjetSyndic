package com.pfa.syndicbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Immeuble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numero;
    private Long nombre_etage;

    @OneToMany(mappedBy = "immeuble")
    private Collection<Revenue> revenues = new ArrayList<>();

    @OneToMany(mappedBy = "immeuble")
    private Collection<Depense> depenses = new ArrayList<>();

    @OneToMany(mappedBy = "immeuble")
    private Collection<Appartement> appartements = new ArrayList<>();

    @ManyToOne
    private SyndicImmeuble syndicImmeuble;




}
