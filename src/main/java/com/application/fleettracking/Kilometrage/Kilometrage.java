package com.application.fleettracking.Kilometrage;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "kilometrage")
public class Kilometrage {

    @Id
    @SequenceGenerator(
        name = "kilometrage_sequence",
        sequenceName = "seqKilometrage",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "seqKilometrage"
    )
    private Long idKilometrage;
    private Date dateVoyage;
    private double debutKm;
    private double finKm;

    public Long getIdKilometrage() {
        return idKilometrage;
    }

    public Date getDateVoyage() {
        return dateVoyage;
    }

    public double getDebutKm() {
        return debutKm;
    }

    public double getFinKm() {
        return finKm;
    }

    public void setIdKilometrage(Long idKilometrage) {
        this.idKilometrage = idKilometrage;
    }

    public void setDateVoyage(Date dateVoyage) {
        this.dateVoyage = dateVoyage;
    }

    public void setDebutKm(double debutKm) {
        this.debutKm = debutKm;
    }

    public void setFinKm(double finKm) {
        this.finKm = finKm;
    }

    public Kilometrage(){}

    public Kilometrage(Long idKilometrage,Date dateVoyage,double debutKm, double finKm){
        this.idKilometrage = idKilometrage;
        this.dateVoyage = dateVoyage;
        this.debutKm = debutKm;
        this.finKm =finKm;
    }

    public Kilometrage(Date dateVoyage,double debutKm, double finKm){
        this.dateVoyage = dateVoyage;
        this.debutKm = debutKm;
        this.finKm =finKm;
    }
    
}
