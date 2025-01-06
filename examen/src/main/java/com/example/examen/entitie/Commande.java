package com.example.examen.entitie;

import java.util.ArrayList;
import java.util.List;

public class Commande {

    private int id;
    private List<Repas> repas;

    public Commande(int idC) {
        this.id = idC;
        this.repas = new ArrayList<>();
    }

    public void ajouterRepas(Repas repas) {
        this.repas.add(repas);
    }

    public double calculerTotal() {
        return repas.stream().mapToDouble(Repas::calculerTotal).sum();
    }

    @Override
    public String toString() {
        return String.format("Commande{id=%d, total=%.2f}", id, calculerTotal());
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public List<Repas> getRepas() { return repas; }
    public void setRepas(List<Repas> repas) { this.repas = repas; }
}
