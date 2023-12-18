package com.application.fleettracking.Vehicule;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class VehiculeService {
    

    public ArrayList<Vehicule> getAllVehicule(){
        ArrayList<Vehicule> allVehicules = new ArrayList<Vehicule>();

        Vehicule v = new Vehicule("Toyota", "Pick-up", 350, "12345WWA");

        allVehicules.add(v);
        return allVehicules;
    }

}
