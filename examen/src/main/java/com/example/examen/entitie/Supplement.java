package com.example.examen.entitie;

public class Supplement {

    private int id;
    private String nom;
    private double prix;

    public Supplement(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return String.format("Supplement{id=%d, nom='%s', prix=%.2f}", id, nom, prix);
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
}
