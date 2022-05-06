package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Residant;
import com.pfa.syndicbackend.repositories.ResidantRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResidantServiceImpl implements ResidantService {
    public ResidantServiceImpl(ResidantRepository residantRepository) {
        this.residantRepository = residantRepository;
    }

    private ResidantRepository residantRepository;

    @Override
    public void supprimerResidant(Long id) {
        residantRepository.deleteById(id);
    }

    @Override
    public List<Residant> findAll() {

        return residantRepository.findAll();
    }

    @Override
    public Residant getById(Long id) {

        return residantRepository.getById(id);
    }

    @Override
    public Residant ajouterResidant(Residant residant) {

        return residantRepository.save(residant);
    }

    @Override
    public Residant updateResidant(Residant residant) {
        return null;
    }
}
