package com.cesi.model;

/**
 * Ville model
 */
public class Ville {
    int id;
    String nom;
    String codePostal;

    // CONSTRUCTOR
    public Ville() {
    }
    public Ville(int id, String nom, String codePostal) {
        this.id = id;
        this.nom = nom;
        this.codePostal = codePostal;
    }

    // GETTER
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getCodePostal() {
        return codePostal;
    }
}
