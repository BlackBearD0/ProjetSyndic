package com.pfa.syndicbackend.services;


import com.pfa.syndicbackend.entities.Syndic;

import java.util.List;

public interface SyndicService {

    void supprimerSyndic(Long id);

    List<Syndic> findAll();

    Syndic getById(Long id);

    Syndic ajouterSyndic(Syndic syndic);

    Syndic updateSyndic(Syndic syndic);
}
