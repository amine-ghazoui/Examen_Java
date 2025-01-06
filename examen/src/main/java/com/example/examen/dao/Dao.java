package com.example.examen.dao;

import java.util.List;

public interface Dao<T>{
    void create(T t);          // Ajouter un objet
    T read(int id);            // Lire un objet par son ID
    void update(T t);          // Mettre à jour un objet
    void delete(int id);       // Supprimer un objet par son ID
    List<T> findAll();         // Trouver tous les objets
}
