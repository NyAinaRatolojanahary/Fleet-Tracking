package com.application.fleettracking.Vehicule;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicule")
public class Vehicule {
    
    @Id
    @SequenceGenerator(
        name = "vehicule_sequence",
        sequenceName = "seqVehicule",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "seqVehicule"
    )
    private Long idVehicule;
    private String marque;
    private String model;
    private String type;
    private double puissance;
    private String matricule;

    public Long getIdVehicule() {
        return idVehicule;
    }

    public String getMarque() {
        return marque;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public double getPuissance() {
        return puissance;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setIdVehicule(Long idVehicule) {
        this.idVehicule = idVehicule;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Vehicule(){}

    public Vehicule(Long idVehicule,String marque,String model,String type,double puissance,String matricule){
        this.idVehicule = idVehicule;
        this.marque = marque;
        this.model = model;
        this.type = type;
        this.puissance = puissance;
        this.matricule = matricule;
    }

    public Vehicule(String marque,String model,String type,double puissance,String matricule){
        this.marque = marque;
        this.model = model;
        this.type = type;
        this.puissance = puissance;
        this.matricule = matricule;
    }

}
