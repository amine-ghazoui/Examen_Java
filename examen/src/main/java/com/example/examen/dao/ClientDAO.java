package com.example.examen.dao;

import com.example.examen.entitie.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements Dao<Client>{

    private List<Client> clients = new ArrayList<>();

    @Override
    public void create(Client client) {
        clients.add(client);
    }

    @Override
    public Client read(int id) {
        for (Client client : clients) {
            if (client.getId() == id) { // Parcourir la liste pour trouver le client
                return client;
            }
        }
        return null; // Retourner null si non trouvé
    }

    @Override
    public void update(Client client) {
        Client existingClient = read(client.getId());
        if (existingClient != null) {
            existingClient.setNom(client.getNom());
            existingClient.setEmail(client.getEmail());
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) { // Trouver le client par ID
                clients.remove(i); // Supprimer le client
                return;
            }
        }
    }

    @Override
    public List<Client> findAll() {
        return new ArrayList<>(clients); // Retourner une copie de la liste
    }
}
