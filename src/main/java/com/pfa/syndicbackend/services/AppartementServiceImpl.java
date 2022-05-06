package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Appartement;
import com.pfa.syndicbackend.repositories.AppartementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AppartementServiceImpl implements AppartementService {

    public AppartementServiceImpl(AppartementRepository appartementRepository) {
        this.appartementRepository = appartementRepository;
    }

    private AppartementRepository appartementRepository;

    @Override
    public List<Appartement> findAll() {
        return appartementRepository.findAll();
    }

    @Override
    public Appartement getById(Long id) {

        return appartementRepository.getById(id);
    }

    @Override
    public Appartement ajouterAppartement(Appartement appartement) {

        return appartementRepository.save(appartement);
    }

    @Override
    public Appartement updateAppartement(Appartement appartement) {

        return null;
    }

    @Override
    public void supprimerAppartement(Long id) {
        appartementRepository.deleteById(id);
    }
}
