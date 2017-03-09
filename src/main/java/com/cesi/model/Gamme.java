package com.cesi.model;

import java.util.List;

/**
 * Gamme model
 */
public class Gamme {
    int id;
    String finitionExterieure;
    String isolant;
    String couverture;
    String typeAngle;
    List<Module> modules;

    // CONSTRUCTOR
    public Gamme() {
    }
    public Gamme(int id, String finitionExterieure, String isolant, String couverture, String typeAngle,
                 List<Module> modules) {
        this.id = id;
        this.finitionExterieure = finitionExterieure;
        this.isolant = isolant;
        this.couverture = couverture;
        this.typeAngle = typeAngle;
        this.modules = modules;
    }

    // GETTER
    public int getId() {
        return id;
    }
    public String getFinitionExterieure() {
        return finitionExterieure;
    }
    public String getIsolant() {
        return isolant;
    }
    public String getCouverture() {
        return couverture;
    }
    public String getTypeAngle() {
        return typeAngle;
    }
    public List<Module> getModules() {
        return modules;
    }
}
