package com.cesi.model;

/**
 * Composant model
 */
public class Composant {
    int id;
    String nature;
    String caracteristiques;
    String uniteUsage;

    // CONSTRUCTOR
    public Composant() {
    }
    public Composant(int id, String nature, String caracteristiques, String uniteUsage) {
        this.id = id;
        this.nature = nature;
        this.caracteristiques = caracteristiques;
        this.uniteUsage = uniteUsage;
    }

    // GETTER
    public int getId() {
        return id;
    }
    public String getNature() {
        return nature;
    }
    public String getCaracteristiques() {
        return caracteristiques;
    }
    public String getUniteUsage() {
        return uniteUsage;
    }
}
