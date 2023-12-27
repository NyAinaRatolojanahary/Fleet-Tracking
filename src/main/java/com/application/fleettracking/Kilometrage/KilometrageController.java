package com.application.fleettracking.Kilometrage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KilometrageController {
    
    private final KilometrageService kilometrageService;

    @Autowired
    public KilometrageController(KilometrageService kilometrageService){
        this.kilometrageService = kilometrageService;
    }

    @GetMapping(path = "/kilometrages")
    public List<Kilometrage> getAllKilometrage(){
        return kilometrageService.getAllKilometrage();
    }

}
