package com.example.h2demo_tp3.entities;

// Utilisation du controleur Hibernate

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adherent
{
    @Id //Nécessaire pour le SGBD d'avoir une une annotation de clé primaire
    @GeneratedValue(strategy = GenerationType.AUTO)// La clé primaire est auto incrémenté
    private Long id;
    private String nom;
    private String ville;
    private int age;

    public Adherent(){

    }

    public Adherent(Long id, String nom, String ville, int age) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setAge(int age) {
        this.age = age;
    }
}