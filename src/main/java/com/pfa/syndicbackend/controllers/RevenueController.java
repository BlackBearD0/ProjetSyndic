package com.pfa.syndicbackend.controllers;

import com.pfa.syndicbackend.entities.Revenue;
import com.pfa.syndicbackend.services.RevenueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RevenueController {

    private RevenueService revenueService;

    public RevenueController(RevenueService revenueService) {
        this.revenueService = revenueService;
    }

    @DeleteMapping(path = "/suppRevenue/{id}")
    public void supprimerRevenue(@PathVariable Long id) {
        revenueService.supprimerRevenue(id);
    }

    @GetMapping(path = "/revenues")
    public List<Revenue> findAll() {
        return revenueService.findAll();
    }

    @GetMapping(path = "/revenue/{id}")
    public Revenue getById(@PathVariable Long id) {
        return revenueService.getById(id);
    }

    @PostMapping(path = "/addRevenue")
    public Revenue ajouterRevenue(@RequestBody Revenue revenue) {
        return revenueService.ajouterRevenue(revenue);
    }

//    @PutMapping
//    public Revenue updateRevenue(Revenue revenue) {
//        return revenueService.updateRevenue(revenue);
//    }
}
