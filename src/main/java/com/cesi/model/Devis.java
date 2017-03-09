package com.cesi.model;

import java.util.Date;
import java.util.List;

/**
 * Devis model
 */
public class Devis {
    int id;
    String nom;
    String etat;
    double totalHT;
    double TVA;
    double remise;
    Date dateCreation;
    Plan plan;
    List<Echelonnement> echelonnements;

    // CONSTRUCTOR
    public Devis() {
    }
    public Devis(int id, String nom, String etat, double totalHT, double TVA, double remise, Date dateCreation,
                 Plan plan, List<Echelonnement> echelonnements) {
        this.id = id;
        this.nom = nom;
        this.etat = etat;
        this.totalHT = totalHT;
        this.TVA = TVA;
        this.remise = remise;
        this.dateCreation = dateCreation;
        this.plan = plan;
        this.echelonnements = echelonnements;
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
    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }
    public double getTotalHT() {
        return totalHT;
    }
    public double getTVA() {
        return TVA;
    }
    public void setTVA(double TVA) {
        this.TVA = TVA;
    }
    public double getRemise() {
        return remise;
    }
    public void setRemise(double remise) {
        this.remise = remise;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public Plan getPlan() {
        return plan;
    }
    public List<Echelonnement> getEchelonnements() {
        return echelonnements;
    }
}
