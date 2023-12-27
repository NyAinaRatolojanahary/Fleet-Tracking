package com.application.fleettracking.Kilometrage;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class KilometrageService {

    private final KilometrageRepository kilometrageRepository;

    @Autowired
    public KilometrageService(KilometrageRepository kilometrageRepository){
        this.kilometrageRepository = kilometrageRepository;
    }

    public List<Kilometrage> getAllKilometrage(){
        return kilometrageRepository.findAll();
    }

    
}