package com.cesi.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by maxime on 08/03/17.
 */
@Entity
@Data
public class Projet {
    private @Id Long id;
    
    private String nom;

    @Column(name="date_creation")
    private Date dateCreation;
    
    @Column(name = "commercial_id")
    private Long commercialId;
    
    @Column(name="client_id")

    private Long clientId;
    private Long commercial_client_id;
    private Long client_ville_id;

    private Projet(){}

    /***************GETTERS AND SETTERS***************/
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

    public Date getDate_creation() {
        return dateCreation;
    }

    public void setDate_creation(Date date_creation) {
        this.dateCreation = date_creation;
    }

    public Long getCommercial_id() {
        return commercialId;
    }

    public void setCommercial_id(Long commercial_id) {
        this.commercialId = commercial_id;
    }

    public Long getClient_id() {
        return clientId;
    }

    public void setClient_id(Long client_id) {
        this.clientId = client_id;
    }

    public Long getCommercial_client_id() {
        return commercial_client_id;
    }

    public void setCommercial_client_id(Long commercial_client_id) {
        this.commercial_client_id = commercial_client_id;
    }

    public Long getClient_ville_id() {
        return client_ville_id;
    }

    public void setClient_ville_id(Long client_ville_id) {
        this.client_ville_id = client_ville_id;
    }
}
