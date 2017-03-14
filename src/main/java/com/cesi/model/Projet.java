package com.cesi.model;

import com.cesi.entity.Commercial;

import java.util.Date;

/**
 * Projet model
 */
public class Projet {
    int id;
    String nom;
    Date dateCreation;
    Commercial commercial;
    Client client;

    // CONSTRUCTOR
    public Projet() {
    }
    public Projet(int id, String nom, Date dateCreation, Commercial commercial, Client client) {
        this.id = id;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.commercial = commercial;
        this.client = client;
    }

    // GETTER/SETTER
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public Commercial getCommercial() {
        return commercial;
    }
    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }
    public Client getClient() {
        return client;
    }
}
