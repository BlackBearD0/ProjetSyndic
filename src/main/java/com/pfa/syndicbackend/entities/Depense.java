package com.pfa.syndicbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Depense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;

    @ManyToOne @JoinColumn(name = "Immeuble")
    private Immeuble immeuble;

    @ManyToOne @JoinColumn(name = "Categorie")
    private DepenseCategorie depenseCategorie;

}
