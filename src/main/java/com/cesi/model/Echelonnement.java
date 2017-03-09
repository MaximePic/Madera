package com.cesi.model;

/**
 * Echelonnement model
 */
public class Echelonnement {
    int id;
    String libelle;
    double taux;

    // CONSTRUCTOR
    public Echelonnement() {
    }
    public Echelonnement(int id, String libelle, Double taux) {
        this.id = id;
        this.libelle = libelle;
        this.taux = taux;
    }

    // GETTER/SETTER
    public int getId() {
        return id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }
}
