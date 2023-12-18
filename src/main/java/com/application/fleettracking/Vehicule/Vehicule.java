package com.application.fleettracking.Vehicule;

public class Vehicule {
    

    private int idVehicule;
    private String marque;
    private String type;
    private double puissance;
    private String matricule;

    public int getIdVehicule() {
        return idVehicule;
    }

    public String getMarque() {
        return marque;
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

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public void setMarque(String marque) {
        this.marque = marque;
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

    public Vehicule(int idVehicule,String marque,String type,double puissance,String matricule){
        this.idVehicule = idVehicule;
        this.marque = marque;
        this.type = type;
        this.puissance = puissance;
        this.matricule = matricule;
    }

    public Vehicule(String marque,String type,double puissance,String matricule){
        this.marque = marque;
        this.type = type;
        this.puissance = puissance;
        this.matricule = matricule;
    }

}
