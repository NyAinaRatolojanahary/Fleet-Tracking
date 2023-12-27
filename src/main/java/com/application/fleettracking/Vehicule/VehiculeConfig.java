package com.application.fleettracking.Vehicule;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(VehiculeRepository repository){
        return args -> {

            Vehicule v1 = new Vehicule("Toyota", "Hilux" , "Pick-up", 350, "12345WWA");
            Vehicule v2 = new Vehicule("Mitsubishi", "L200" ,"Pick-up", 350, "67890WWA");
            Vehicule v3 = new Vehicule("Ford", "Ranger" , "Pick-up", 350, "11121WWA");

            repository.saveAll(
                List.of(v1,v2,v3)
            );

        };
    }

}
