package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Syndic;
import com.pfa.syndicbackend.repositories.SyndicRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import java.util.List;

@Service
@Transactional
public class SyndicServiceImpl implements SyndicService {

    public SyndicServiceImpl(SyndicRepository syndicRepository) {
        this.syndicRepository = syndicRepository;
    }

    private SyndicRepository syndicRepository;

    @Override
    public void supprimerSyndic(Long id) {
        syndicRepository.deleteById(id);
    }

    @Override
    public List<Syndic> findAll() {

        return syndicRepository.findAll();
    }

    @Override
    public Syndic getById(Long id) {

        return syndicRepository.getById(id);
    }

    @Override
    public Syndic ajouterSyndic(Syndic syndic) {

        return syndicRepository.save(syndic);
    }

    @Override
    public Syndic updateSyndic(Syndic syndic) {
        return null;
    }
}
