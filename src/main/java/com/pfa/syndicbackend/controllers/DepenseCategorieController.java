package com.pfa.syndicbackend.controllers;

import com.pfa.syndicbackend.entities.DepenseCategorie;
import com.pfa.syndicbackend.services.DepenseCategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepenseCategorieController {

    private DepenseCategorieService depenseCategorieService;

    public DepenseCategorieController(DepenseCategorieService depenseCategorieService) {
        this.depenseCategorieService = depenseCategorieService;
    }

    @DeleteMapping(path = "suppDepenseCategorie/{id}")
    public void supprimerDepenseCategorie(@PathVariable Long id) {

        depenseCategorieService.supprimerDepenseCategorie(id);
    }

    @GetMapping(path = "/depensecategories")
    public List<DepenseCategorie> findAll() {

        return depenseCategorieService.findAll();
    }

    @GetMapping(path = "/depensecategorie/{id}")
    public DepenseCategorie getById(@PathVariable Long id) {

        return depenseCategorieService.getById(id);
    }

    @PostMapping(path = "/addDepenseCategorie")
    public DepenseCategorie ajouterDepenseCategorie(@RequestBody DepenseCategorie depenseCategorie) {

        return depenseCategorieService.ajouterDepenseCategorie(depenseCategorie);
    }

//    @PutMapping
//    public DepenseCategorie updateDepenseCategorie(DepenseCategorie depenseCategorie) {
//
//        return depenseCategorieService.updateDepenseCategorie(depenseCategorie);
//    }

}
