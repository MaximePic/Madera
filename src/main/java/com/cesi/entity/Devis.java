package com.cesi.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Entité du devis.
 */
@Data
@Entity
public class Devis {
    private @Id Long id;
    private String nom;
    private String etat;
    @Column(name="total_ht")
    private double totalHT;
    private double tva;
    private double remise;
    @Column(name="date_creation")
    private Date dateCreation;
    @Column(name="echelonnement_id")
    private Long echelonnementId;
    @Column(name="projet_id")
    private Long projetId;

    public Devis() {
    }



    /***************GETTERS AND SETTERS***************/
    public Long getId() {
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

    public void setTotalHT(double totalHT) {
        this.totalHT = totalHT;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
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

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getEchelonnementId() {
        return echelonnementId;
    }

    public void setEchelonnementId(Long echelonnementId) {
        this.echelonnementId = echelonnementId;
    }

    public Long getProjetId() {
        return projetId;
    }

    public void setProjetId(Long projetId) {
        this.projetId = projetId;
    }
}
