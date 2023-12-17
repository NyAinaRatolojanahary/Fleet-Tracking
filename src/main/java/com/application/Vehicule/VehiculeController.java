package com.application.Vehicule;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(path = "myApp")
public class VehiculeController {

    private final VehiculeService vehiculeService;

    public VehiculeController(VehiculeService vehiculeService){
        this.vehiculeService = vehiculeService;
    }
    
    @GetMapping(value = "/vehicules")
    public ArrayList<Vehicule> getAllVehicule(){
        return vehiculeService.getAllVehicule();
    }

}
