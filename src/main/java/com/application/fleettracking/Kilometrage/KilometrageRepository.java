package com.application.fleettracking.Kilometrage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KilometrageRepository extends JpaRepository<Kilometrage, Long> {
    
}
