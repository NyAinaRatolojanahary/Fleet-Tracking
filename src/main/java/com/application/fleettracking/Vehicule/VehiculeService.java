package com.application.fleettracking.Vehicule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Autowired
    public VehiculeService(VehiculeRepository vehiculeRepository){
        this.vehiculeRepository = vehiculeRepository;
    } 

    public List<Vehicule> getAllVehicule(){
        // ArrayList<Vehicule> allVehicules = new ArrayList<Vehicule>();

        // Vehicule v = new Vehicule("Toyota", "Pick-up", 350, "12345WWA");

        // allVehicules.add(v);
        // return allVehicules;
        return vehiculeRepository.findAll();
    }

}
