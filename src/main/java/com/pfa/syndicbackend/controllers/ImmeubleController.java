package com.pfa.syndicbackend.controllers;

import com.pfa.syndicbackend.entities.Immeuble;
import com.pfa.syndicbackend.services.ImmeubleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImmeubleController {

    private ImmeubleService immeubleService;

    public ImmeubleController(ImmeubleService immeubleService) {
        this.immeubleService = immeubleService;
    }

    @DeleteMapping(path = "suppImmeuble/{id}")
    public void supprimerImmeuble(@PathVariable Long id) {
        immeubleService.supprimerImmeuble(id);
    }

    @GetMapping(path = "/immeubles")
    public List<Immeuble> findAll() {
        return immeubleService.findAll();
    }

    @GetMapping(path = "/immeuble/{id}")
    public Immeuble getById(@PathVariable Long id) {
        return immeubleService.getById(id);
    }

    @PostMapping(path = "/addImmeuble")
    public Immeuble ajouterImmeuble(@RequestBody Immeuble immeuble) {
        return immeubleService.ajouterImmeuble(immeuble);
    }

//    @PutMapping
//    public Immeuble updateImmeuble(Immeuble immeuble) {
//        return immeubleService.updateImmeuble(immeuble);
//    }
}
