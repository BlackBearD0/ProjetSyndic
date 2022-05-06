package com.pfa.syndicbackend.controllers;

import com.pfa.syndicbackend.entities.Syndic;
import com.pfa.syndicbackend.services.SyndicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SyndicController {

    private SyndicService syndicService;

    public SyndicController(SyndicService syndicService) {
        this.syndicService = syndicService;
    }

    @DeleteMapping(path = "suppSyndic/{id}")
    public void supprimerSyndic(@PathVariable Long id) {
        syndicService.supprimerSyndic(id);
    }

    @GetMapping(path = "/syndics")
    public List<Syndic> findAll() {
        return syndicService.findAll();
    }

    @GetMapping(path = "/syndic/{id}")
    public Syndic getById(@PathVariable Long id) {
        return syndicService.getById(id);
    }

    @PostMapping(path = "/addSyndic")
    public Syndic ajouterSyndic(@RequestBody Syndic syndic) {
        return syndicService.ajouterSyndic(syndic);
    }

//    @PutMapping
//    public Syndic updateSyndic(Syndic syndic) {
//        return syndicService.updateSyndic(syndic);
//    }
}
