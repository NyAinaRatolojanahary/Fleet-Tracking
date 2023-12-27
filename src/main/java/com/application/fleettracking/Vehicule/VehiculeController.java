package com.application.fleettracking.Vehicule;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class VehiculeController {

    private final VehiculeService vehiculeService;

    @Autowired
    public VehiculeController(VehiculeService vehiculeService){
        this.vehiculeService = vehiculeService;
    }
    
    @GetMapping(path = "/vehicules")
    public List<Vehicule> getAllVehicule(){
        return vehiculeService.getAllVehicule();
    }

}
