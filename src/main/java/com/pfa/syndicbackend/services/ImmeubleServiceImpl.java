package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Immeuble;
import com.pfa.syndicbackend.repositories.ImmeubleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImmeubleServiceImpl implements ImmeubleService {

    public ImmeubleServiceImpl(ImmeubleRepository immeubleRepository) {
        this.immeubleRepository = immeubleRepository;
    }

    private ImmeubleRepository immeubleRepository;

    @Override
    public void supprimerImmeuble(Long id) {
        immeubleRepository.deleteById(id);
    }

    @Override
    public List<Immeuble> findAll() {

        return immeubleRepository.findAll();
    }

    @Override
    public Immeuble getById(Long id) {

        return immeubleRepository.getById(id);
    }

    @Override
    public Immeuble ajouterImmeuble(Immeuble immeuble) {

        return immeubleRepository.save(immeuble);
    }

    @Override
    public Immeuble updateImmeuble(Immeuble immeuble) {

        return null;
    }
}
