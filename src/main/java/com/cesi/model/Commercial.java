package com.cesi.model;

/**
 * Commercial model
 */
public class Commercial {
    int id;
    String nom;
    String prenom;
    String numeroRue;
    String nomRue;
    String portable;
    String fixe;
    String email;
    String login;
    String motPasse;
    Ville ville;

    // CONSTRUCTOR
    public Commercial() {
    }
    public Commercial(int id, String nom, String prenom, String numeroRue, String nomRue, String portable, String fixe,
                      String email, String login, String motPasse, Ville ville) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroRue = numeroRue;
        this.nomRue = nomRue;
        this.portable = portable;
        this.fixe = fixe;
        this.email = email;
        this.login = login;
        this.motPasse = motPasse;
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
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getMotPasse() {
        return motPasse;
    }
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }
    public Ville getVille() {
        return ville;
    }
    public void setVille(Ville ville) {
        this.ville = ville;
    }
}
