package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Revenue;
import com.pfa.syndicbackend.repositories.RevenueRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RevenueServiceImpl implements RevenueService {
    public RevenueServiceImpl(RevenueRepository revenueRepository) {
        this.revenueRepository = revenueRepository;
    }

    private RevenueRepository revenueRepository;

    @Override
    public void supprimerRevenue(Long id) {
        revenueRepository.deleteById(id);
    }

    @Override
    public List<Revenue> findAll() {

        return revenueRepository.findAll();
    }

    @Override
    public Revenue getById(Long id) {
        return revenueRepository.getById(id);
    }

    @Override
    public Revenue ajouterRevenue(Revenue revenue) {

        return revenueRepository.save(revenue);
    }

    @Override
    public Revenue updateRevenue(Revenue revenue) {
        return null;
    }
}
