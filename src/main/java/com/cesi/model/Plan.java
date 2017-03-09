package com.cesi.model;

import java.util.Date;
import java.util.List;

/**
 * Plan model
 */
public class Plan {
    int id;
    String nom;
    Date dateCreation;
    Modele modele;
    List<Module> modules;

    // CONSTRUCTOR
    public Plan() {
    }
    public Plan(int id, String nom, Date dateCreation, Modele modele, List<Module> modules) {
        this.id = id;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.modele = modele;
        this.modules = modules;
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
    public Modele getModele() {
        return modele;
    }
    public List<Module> getModules() {
        return modules;
    }
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
