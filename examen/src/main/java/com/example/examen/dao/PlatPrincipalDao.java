package com.example.examen.dao;

import com.example.examen.entitie.PlatPrincipal;

import java.util.ArrayList;
import java.util.List;

public class PlatPrincipalDao implements Dao<PlatPrincipal>{

    private List<PlatPrincipal> platsPrincipals = new ArrayList<>();

    @Override
    public void create(PlatPrincipal platP) {
        platsPrincipals.add(platP);
    }

    @Override
    public PlatPrincipal read(int id) {
        for (PlatPrincipal plat : platsPrincipals) {
            if (plat.getId() == id) {
                return plat;
            }
        }
        return null;
    }

    @Override
    public void update(PlatPrincipal platP) {

        for (int i = 0; i < platsPrincipals.size(); i++) {
            if (platsPrincipals.get(i).getId() == platP.getId()) {
                platsPrincipals.set(i, platP);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {

        for (int i = 0; i < platsPrincipals.size(); i++) {
            if (platsPrincipals.get(i).getId() == id) {
                platsPrincipals.remove(i);
                return;
            }
        }
    }

    @Override
    public List<PlatPrincipal> findAll() {
        return new ArrayList<>(platsPrincipals);
    }
}
