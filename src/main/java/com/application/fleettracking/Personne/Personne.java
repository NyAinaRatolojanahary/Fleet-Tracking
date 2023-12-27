package com.application.fleettracking.Personne;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "personne")
public class Personne {
    
    @Id
    @SequenceGenerator(
        name = "personne_sequence",
        sequenceName = "seqPersonne",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "seqPersonne"
    )
    private Long idPersonne;
    private String nomPersonne;
    private String prenomPersonne;
    private Date dateNaissance;
    private String contact;
    

    public Long getIdPersonne() {
        return idPersonne;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public String getPrenomPersonne() {
        return prenomPersonne;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getContact() {
        return contact;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Personne(){}

    public Personne(Long idPersonne,String nomPersonne,String prenomPersonne,Date dateNaissance,String contact){
        this.idPersonne = idPersonne;
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
        this.dateNaissance = dateNaissance;
        this.contact = contact;
    }

    public Personne(String nomPersonne,String prenomPersonne,Date dateNaissance,String contact){
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
        this.dateNaissance = dateNaissance;
        this.contact = contact;
    }
    
}
