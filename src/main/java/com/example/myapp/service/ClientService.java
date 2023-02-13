package com.example.myapp.service;

import com.example.myapp.entity.Client;

import java.util.List;

public interface ClientService {
    public void saveOrUpdate(Client client);
    public void delete(int id);
    public Client findById(int id);
    public List<Client> findAll();
}
