package com.example.myapp.service;

import com.example.myapp.entity.Client;
import com.example.myapp.respository.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientDAO clientDAO;

    @Autowired
    public ClientServiceImpl(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Transactional
    @Override
    public void saveOrUpdate(Client client) {
        clientDAO.saveOrUpdate(client);
    }

    @Transactional
    @Override
    public void delete(int id) {
        clientDAO.delete(id);
    }

    @Transactional
    @Override
    public Client findById(int id) {
        return clientDAO.findById(id);
    }

    @Transactional
    @Override
    public List<Client> findAll() {
        return clientDAO.findAll();
    }
}
