package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Depense;
import com.pfa.syndicbackend.repositories.DepenseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepenseServiceImpl implements DepenseService {

    public DepenseServiceImpl(DepenseRepository depenseRepository) {
        this.depenseRepository = depenseRepository;
    }

    private DepenseRepository depenseRepository;


    @Override
    public void supprimerDepense(Long id) {
        depenseRepository.deleteById(id);
    }

    @Override
    public List<Depense> findAll() {

        return depenseRepository.findAll();
    }

    @Override
    public Depense getById(Long id) {

        return depenseRepository.getById(id);
    }

    @Override
    public Depense ajouterDepense(Depense depense) {

        return depenseRepository.save(depense);
    }

    @Override
    public Depense updateDepense(Depense depense) {

        return null;
    }
}
