package com.pfa.syndicbackend.controllers;

import com.pfa.syndicbackend.entities.Appartement;
import com.pfa.syndicbackend.services.AppartementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppartementController {

    private AppartementService appartementService;

    public AppartementController(AppartementService appartementService) {
        this.appartementService = appartementService;
    }

    @GetMapping(path = "/appartements")
    public List<Appartement> findAll() {
        return appartementService.findAll();
    }

    @GetMapping(path = "/appartement/{id}")
    public Appartement getById(@PathVariable Long id) {
        return appartementService.getById(id);
    }

    @PostMapping(path = "/addAppartement")
    public Appartement ajouterAppartement(@RequestBody Appartement appartement) {
        return appartementService.ajouterAppartement(appartement);
    }

//    @PutMapping
//    public Appartement updateAppartement(Appartement appartement) {
//        return appartementService.updateAppartement(appartement);
//    }

    @DeleteMapping(path = "/suppAppartement/{id}")
    public void supprimerAppartement(@PathVariable Long id) {
        appartementService.supprimerAppartement(id);
    }


}
