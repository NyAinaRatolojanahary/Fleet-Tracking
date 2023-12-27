package com.application.fleettracking.Personne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneController {

    private final PersonneService personneService;

    @Autowired
    public PersonneController (PersonneService personneService){
        this.personneService = personneService;
    }

    @GetMapping(path = "/personnes")
    public List<Personne> getAllPersonne(){
        return personneService.getAllPersonne();
    }
    
}
