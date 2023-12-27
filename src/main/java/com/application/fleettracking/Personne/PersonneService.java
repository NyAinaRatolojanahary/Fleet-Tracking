package com.application.fleettracking.Personne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {
    
    private final PersonneRepository personneRepository;

    @Autowired
    public PersonneService(PersonneRepository personneRepository){
        this.personneRepository = personneRepository;
    }

    public List<Personne> getAllPersonne(){
        return personneRepository.findAll();
    }

}
