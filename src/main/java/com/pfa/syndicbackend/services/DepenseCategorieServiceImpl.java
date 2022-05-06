package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.DepenseCategorie;
import com.pfa.syndicbackend.repositories.DepenseCategorieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepenseCategorieServiceImpl implements DepenseCategorieService {

    public DepenseCategorieServiceImpl(DepenseCategorieRepository depenseCategorieRepository) {
        this.depenseCategorieRepository = depenseCategorieRepository;
    }

    private DepenseCategorieRepository depenseCategorieRepository;

    @Override
    public void supprimerDepenseCategorie(Long id) {
        depenseCategorieRepository.deleteById(id);
    }

    @Override
    public List<DepenseCategorie> findAll() {

        return depenseCategorieRepository.findAll();
    }

    @Override
    public DepenseCategorie getById(Long id) {

        return depenseCategorieRepository.getById(id);
    }

    @Override
    public DepenseCategorie ajouterDepenseCategorie(DepenseCategorie depenseCategorie) {

        return depenseCategorieRepository.save(depenseCategorie);
    }

    @Override
    public DepenseCategorie updateDepenseCategorie(DepenseCategorie depenseCategorie) {

        return null;
    }
}
