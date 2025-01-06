package com.example.examen.entitie;

import java.util.List;

public class PlatPrincipal {
    private int id;
    private String nom;
    private List<Ingredient> ingredients;

    public PlatPrincipal(int id, String nom, List<Ingredient> ingredients) {
        this.id = id;
        this.nom = nom;
        this.ingredients = ingredients;
    }

    public double calculerPrix() {
        return ingredients.stream().mapToDouble(Ingredient::getPrix).sum();
    }

    @Override
    public String toString() {
        return String.format("PlatPrincipal{id=%d, nom='%s', prix=%.2f}", id, nom, calculerPrix());
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public List<Ingredient> getIngredients() { return ingredients; }
    public void setIngredients(List<Ingredient> ingredients) { this.ingredients = ingredients; }
}
