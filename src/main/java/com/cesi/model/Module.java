package com.cesi.model;

import java.util.List;

/**
 * Module model
 */
public class Module {
    int id;
    String nom;
    double longueur;
    double prixHT;
    List<Composant> composants;

    // CONSTRUCTOR
    public Module() {
    }
    public Module(int id, String nom, double longueur, double prixHT, List<Composant> composants) {
        this.id = id;
        this.nom = nom;
        this.longueur = longueur;
        this.prixHT = prixHT;
        this.composants = composants;
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
    public double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double getPrixHT() {
        return prixHT;
    }
    public List<Composant> getComposants() {
        return composants;
    }
}
