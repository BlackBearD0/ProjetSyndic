package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Depense;

import java.util.List;

public interface DepenseService {

    void supprimerDepense(Long id);

    List<Depense> findAll();

    Depense getById(Long id);

    Depense ajouterDepense(Depense depense);

    Depense updateDepense(Depense depense);
}
