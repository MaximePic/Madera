package com.cesi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Commercial {

    private @Id Long id;
    private String nom;
    private String prenom;
    private String numero_rue;
    private String nom_rue;
    private String portbale;
    private String fixe;
    private String email;
    private String login;
    private String mot_passe;
    private String ville_id;



    private Commercial() {}


    public Commercial(Long id, String nom, String prenom, String numero_rue, String nom_rue, String portbale, String fixe,
                      String email, String login, String mot_passe, String ville_id) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numero_rue = numero_rue;
        this.nom_rue = nom_rue;
        this.portbale = portbale;
        this.fixe = fixe;
        this.email = email;
        this.login = login;
        this.mot_passe = mot_passe;
        this.ville_id = ville_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNumero_rue() {
        return numero_rue;
    }

    public void setNumero_rue(String numero_rue) {
        this.numero_rue = numero_rue;
    }

    public String getNom_rue() {
        return nom_rue;
    }

    public void setNom_rue(String nom_rue) {
        this.nom_rue = nom_rue;
    }

    public String getPortbale() {
        return portbale;
    }

    public void setPortbale(String portbale) {
        this.portbale = portbale;
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

    public String getMot_passe() {
        return mot_passe;
    }

    public void setMot_passe(String mot_passe) {
        this.mot_passe = mot_passe;
    }

    public String getVille_id() {
        return ville_id;
    }

    public void setVille_id(String ville_id) {
        this.ville_id = ville_id;
    }
}
//}