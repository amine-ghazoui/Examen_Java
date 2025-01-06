package com.example.examen.dao;

import com.example.examen.entitie.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class IngredientDao implements Dao<Ingredient>{

    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public void create(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public Ingredient read(int id) {

        for (Ingredient ingredient : ingredients) {
            if (ingredient.getId() == id) {
                return ingredient;
            }
        }
        return null;
    }

    @Override
    public void update(Ingredient ingredient) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getId() == ingredient.getId()) {
                ingredients.set(i, ingredient);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getId() == id) {
                ingredients.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Ingredient> findAll() {
        return new ArrayList<>(ingredients);
    }
}
