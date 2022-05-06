package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Residant;

import java.util.List;

public interface ResidantService {

    void supprimerResidant(Long id);

    List<Residant> findAll();

    Residant getById(Long id);

    Residant ajouterResidant(Residant residant);

    Residant updateResidant(Residant residant);
}
