package com.cesi.model;

/**
 * CoupePrincipe model
 */
public class CoupePrincipe {
    int id;
    String nom;

    // CONSTRUCTOR
    public CoupePrincipe() {
    }
    public CoupePrincipe(int id, String nom) {
        this.id = id;
        this.nom = nom;
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
}
