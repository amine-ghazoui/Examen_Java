package com.example.examen.entitie;

import java.util.ArrayList;
import java.util.List;

public class Repas {

    private PlatPrincipal platPrincipal;
    private List<Ingredient> ingredientsSupplementaires;
    private List<Supplement> supplements;

    public Repas(PlatPrincipal platPrincipal) {
        this.platPrincipal = platPrincipal;
        this.ingredientsSupplementaires = new ArrayList<>();
        this.supplements = new ArrayList<>();
    }

    public void ajouterIngredient(Ingredient ingredient) {
        ingredientsSupplementaires.add(ingredient);
    }

    public void ajouterSupplement(Supplement supplement) {
        supplements.add(supplement);
    }

    public double calculerTotal() {
        double totalIngredients = ingredientsSupplementaires.stream()
                .mapToDouble(Ingredient::getPrix)
                .sum();
        double totalSupplements = supplements.stream()
                .mapToDouble(Supplement::getPrix)
                .sum();
        return platPrincipal.calculerPrix() + totalIngredients + totalSupplements;
    }

    @Override
    public String toString() {
        return String.format("Repas{platPrincipal='%s', total=%.2f}", platPrincipal.getNom(), calculerTotal());
    }

    // Getters et Setters
    public PlatPrincipal getPlatPrincipal() { return platPrincipal; }
    public void setPlatPrincipal(PlatPrincipal platPrincipal) { this.platPrincipal = platPrincipal; }

    public List<Ingredient> getIngredientsSupplementaires() {
        return ingredientsSupplementaires;
    }
    public void setIngredientsSupplementaires(List<Ingredient> ingredientsSupplementaires) {
        this.ingredientsSupplementaires = ingredientsSupplementaires;
    }

    public List<Supplement> getSupplements() { return supplements; }
    public void setSupplements(List<Supplement> supplements) { this.supplements = supplements; }
}

