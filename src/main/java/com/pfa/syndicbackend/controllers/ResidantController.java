package com.pfa.syndicbackend.controllers;

import com.pfa.syndicbackend.entities.Residant;
import com.pfa.syndicbackend.services.ResidantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResidantController {

    private ResidantService residantService;

    public ResidantController(ResidantService residantService) {
        this.residantService = residantService;
    }

    @DeleteMapping(path = "/suppResidant/{id}")
    public void supprimerResidant(@PathVariable Long id) {
        residantService.supprimerResidant(id);
    }

    @GetMapping(path = "/residants")
    public List<Residant> findAll() {
        return residantService.findAll();
    }

    @GetMapping(path = "/residant/{id}")
    public Residant getById(@PathVariable Long id) {
        return residantService.getById(id);
    }

    @PostMapping(path = "/addResidant")
    public Residant ajouterResidant(@RequestBody Residant residant) {
        return residantService.ajouterResidant(residant);
    }

//    @PutMapping
//    public Residant updateResidant(Residant residant) {
//        return residantService.updateResidant(residant);
//    }
}
