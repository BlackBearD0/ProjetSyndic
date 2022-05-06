package com.pfa.syndicbackend.services;

import com.pfa.syndicbackend.entities.Revenue;

import java.util.List;

public interface RevenueService {

    void supprimerRevenue(Long id);

    List<Revenue> findAll();

    Revenue getById(Long id);

    Revenue ajouterRevenue(Revenue revenue);

    Revenue updateRevenue(Revenue revenue);
}
