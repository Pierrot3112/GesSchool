package com.pierrot.gesSchool.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Eleves {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String sexe;
    private String ecoleOrigine;
    private String classe;
    private String matricule;
    private String nomPere;
    private String professionPere;
    private String nomMere;
    private String professionMere;
    private String contactParent;
    private String adresseParent;
    private String imageEleve;

    // Getters et Setters

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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEcoleOrigine() {
        return ecoleOrigine;
    }

    public void setEcoleOrigine(String ecoleOrigine) {
        this.ecoleOrigine = ecoleOrigine;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNomPere() {
        return nomPere;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public String getProfessionPere() {
        return professionPere;
    }

    public void setProfessionPere(String professionPere) {
        this.professionPere = professionPere;
    }

    public String getNomMere() {
        return nomMere;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public String getProfessionMere() {
        return professionMere;
    }

    public void setProfessionMere(String professionMere) {
        this.professionMere = professionMere;
    }

    public String getContactParent() {
        return contactParent;
    }

    public void setContactParent(String contactParent) {
        this.contactParent = contactParent;
    }

    public String getAdresseParent() {
        return adresseParent;
    }

    public void setAdresseParent(String adresseParent) {
        this.adresseParent = adresseParent;
    }

    public String getImageEleve() {
        return imageEleve;
    }

    public void setImageEleve(String imageEleve) {
        this.imageEleve = imageEleve;
    }
}

