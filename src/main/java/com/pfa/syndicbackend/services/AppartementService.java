package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Appartement;

import java.util.List;

public interface AppartementService {

    List<Appartement> findAll();

    Appartement getById(Long id);

    Appartement ajouterAppartement(Appartement appartement);

    Appartement updateAppartement(Appartement appartement);

    void supprimerAppartement(Long id);

}
