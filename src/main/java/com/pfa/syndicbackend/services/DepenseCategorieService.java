package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.DepenseCategorie;

import java.util.List;

public interface DepenseCategorieService {

    void supprimerDepenseCategorie(Long id);

    List<DepenseCategorie> findAll();

    DepenseCategorie getById(Long id);

    DepenseCategorie ajouterDepenseCategorie(DepenseCategorie depenseCategorie);

    DepenseCategorie updateDepenseCategorie(DepenseCategorie depenseCategorie);
}
