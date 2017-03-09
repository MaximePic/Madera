package com.cesi.model;

import java.util.Date;
import java.util.List;

/**
 * Modele model
 */
public class Modele {
    int id;
    String nom;
    Date dateCreation;
    List<Module> modules;
    CoupePrincipe coupePrincipe;

    // CONSTRUCTOR
    public Modele() {
    }
    public Modele(int id, String nom, Date dateCreation, List<Module> modules, CoupePrincipe coupePrincipe) {
        this.id = id;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.modules = modules;
        this.coupePrincipe = coupePrincipe;
    }

    // GETTER/SETTER
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public List<Module> getModules() {
        return modules;
    }
    public CoupePrincipe getCoupePrincipe() {
        return coupePrincipe;
    }
}
