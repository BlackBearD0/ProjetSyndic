package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Immeuble;

import java.util.List;

public interface ImmeubleService {

    void supprimerImmeuble(Long id);

    List<Immeuble> findAll();

    Immeuble getById(Long id);

    Immeuble ajouterImmeuble(Immeuble immeuble);

    Immeuble updateImmeuble(Immeuble immeuble);
}
