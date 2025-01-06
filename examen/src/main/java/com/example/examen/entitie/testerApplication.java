package com.example.examen.entitie;

import com.example.examen.dao.IngredientDao;

import java.util.Arrays;

public class testerApplication {
    public static void main(String[] args) {
        // Création des ingrédients
        Ingredient ingredient1 = new Ingredient(1, "Pommes de terre", 5.0);
        Ingredient ingredient2 = new Ingredient(2, "Carottes", 3.0);
        Ingredient ingredient3 = new Ingredient(3, "Viande hachée", 20.0);

        // Création des suppléments
        Supplement supplement1 = new Supplement(1, "Boisson gazeuse", 10.0);
        Supplement supplement2 = new Supplement(2, "Frites", 15.0);

        // Création des plats principaux
        PlatPrincipal plat1 = new PlatPrincipal(1, "Tajine", Arrays.asList(ingredient1, ingredient3));
        PlatPrincipal plat2 = new PlatPrincipal(2, "Couscous", Arrays.asList(ingredient2, ingredient3));

        // Création des repas
        Repas repas1 = new Repas(plat1);
        repas1.ajouterIngredient(ingredient1); // Ajout d'ingrédients supplémentaires
        repas1.ajouterSupplement(supplement1);

        Repas repas2 = new Repas(plat2);
        repas2.ajouterIngredient(ingredient2);
        repas2.ajouterSupplement(supplement2);

        // Création d'une commande
        Commande commande1 = new Commande(1);
        commande1.ajouterRepas(repas1);
        commande1.ajouterRepas(repas2);

        // Création d'un client
        Client client1 = new Client(1, "Mohamed Amine", "amine@example.com");
        client1.ajouterCommande(commande1);

        // Affichage des détails de la commande
        System.out.println("-------- Détails de la commande --------");
        System.out.println("Client : " + client1.getNom());
        System.out.println("Email : " + client1.getEmail());

        for (Commande commande : client1.getCommandes()) {
            System.out.println("Commande #" + commande.getId());
            for (Repas repas : commande.getRepas()) {
                System.out.println("Plat principal : " + repas.getPlatPrincipal().getNom());
                System.out.println("Ingrédients : ");
                for (Ingredient ingredient : repas.getPlatPrincipal().getIngredients()) {
                    System.out.println("- " + ingredient.getNom() + " : " + ingredient.getPrix() + " DH");
                }
                System.out.println("Suppléments : ");
                for (Supplement supplement : repas.getSupplements()) {
                    System.out.println("- " + supplement.getNom() + " : " + supplement.getPrix() + " DH");
                }
                System.out.println("Total repas : " + repas.calculerTotal() + " DH");
            }
            System.out.println("Total commande : " + commande.calculerTotal() + " DH");
        }
    }
}
