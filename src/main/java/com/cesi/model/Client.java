package com.cesi.model;

import java.util.Date;

/**
 * Client model
 */
public class Client {
    int id;
    String nom;
    String prenom;
    String numeroRue;
    String nomRue;
    String portable;
    String fixe;
    String email;
    Date dateCreation;
    Ville ville;

    // CONSTRUCTOR
    public Client() {
    }
    public Client(String nom, String prenom, String numeroRue, String nomRue, String portable, String fixe,
                  String email, Date dateCreation, Ville ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroRue = numeroRue;
        this.nomRue = nomRue;
        this.portable = portable;
        this.fixe = fixe;
        this.email = email;
        this.dateCreation = dateCreation;
        this.ville = ville;
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
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNumeroRue() {
        return numeroRue;
    }
    public void setNumeroRue(String numeroRue) {
        this.numeroRue = numeroRue;
    }
    public String getNomRue() {
        return nomRue;
    }
    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }
    public String getPortable() {
        return portable;
    }
    public void setPortable(String portable) {
        this.portable = portable;
    }
    public String getFixe() {
        return fixe;
    }
    public void setFixe(String fixe) {
        this.fixe = fixe;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public Ville getVille() {
        return ville;
    }
    public void setVille(Ville ville) {
        this.ville = ville;
    }
}
