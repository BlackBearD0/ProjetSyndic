package com.pfa.syndicbackend.controllers;

import com.pfa.syndicbackend.entities.Depense;
import com.pfa.syndicbackend.services.DepenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepenseController {

    private DepenseService depenseService;


    public DepenseController(DepenseService depenseService) {
        this.depenseService = depenseService;
    }


    @DeleteMapping(path = "suppDepense/{id}")
    public void supprimerDepense(@PathVariable Long id) {
        depenseService.supprimerDepense(id);
    }

    @GetMapping(path = "/depenses")
    public List<Depense> findAll() {
        return depenseService.findAll();
    }

    @GetMapping(path = "/depense/{id}")
    public Depense getById(@PathVariable Long id) {
        return depenseService.getById(id);
    }

    @PostMapping(path = "/addDepense")
    public Depense ajouterDepense(@RequestBody Depense depense) {
        return depenseService.ajouterDepense(depense);
    }

//    @PutMapping
//    public Depense updateDepense(Depense depense) {
//        return depenseService.updateDepense(depense);
//    }


}
