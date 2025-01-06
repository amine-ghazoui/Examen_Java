package com.example.examen.entitie;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private String nom;
    private String email;
    private List<Commande> commandes;

    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.commandes = new ArrayList<>();
    }

    public void ajouterCommande(Commande commande) {
        commandes.add(commande);
    }

    @Override
    public String toString() {
        return String.format("Client{id=%d, nom='%s', email='%s'}", id, nom, email);
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Commande> getCommandes() { return commandes; }
    public void setCommandes(List<Commande> commandes) { this.commandes = commandes; }
}
