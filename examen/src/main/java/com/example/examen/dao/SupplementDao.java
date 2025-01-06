package com.example.examen.dao;

import com.example.examen.entitie.Supplement;

import java.util.ArrayList;
import java.util.List;

public class SupplementDao implements Dao<Supplement>{

    private List<Supplement> supplements = new ArrayList<>();
    @Override
    public void create(Supplement supplement) {
        supplements.add(supplement);
    }

    @Override
    public Supplement read(int id) {
        for (Supplement supplement : supplements) {
            if (supplement.getId() == id) {
                return supplement;
            }
        }
        return null;
    }

    @Override
    public void update(Supplement supplement) {
        for (int i = 0; i < supplements.size(); i++) {
            if (supplements.get(i).getId() == supplement.getId()) {
                supplements.set(i, supplement);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < supplements.size(); i++) {
            if (supplements.get(i).getId() == id) {
                supplements.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Supplement> findAll() {
        return new ArrayList<>(supplements);
    }
}
