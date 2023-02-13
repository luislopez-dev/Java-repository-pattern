package com.example.myapp.respository;

import com.example.myapp.entity.Client;

import java.util.List;

public interface ClientDAO {
    public void saveOrUpdate(Client client);
    public void delete(int id);
    public Client findById(int id);
    public List<Client> findAll();
}
