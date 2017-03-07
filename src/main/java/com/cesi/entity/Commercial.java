package com.cesi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Commercial {

    private @Id @GeneratedValue Long id;
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


    public Commercial(String nom, String prenom, String numero_rue, String nom_rue, String portbale, String fixe,
                      String email, String login, String mot_passe, String ville_id) {
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
}
//}