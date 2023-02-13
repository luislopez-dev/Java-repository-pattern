package com.example.myapp.respository;

import com.example.myapp.entity.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientDAOImpl {

    private final EntityManager entityManager;
    @Autowired
    public ClientDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<Client> findAll(Client client){
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from Client", Client.class);
        List<Client> clients = query.getResultList();
        return clients;
    }
    public Client findById(int id){
        Session session = entityManager.unwrap(Session.class);
        Client client = session.get(Client.class, id);
        return client;
    }
    public void saveOrUpdate(Client client){
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(client);
    }
    public void delete(int id){
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from Client where id=:clientId");
        query.setParameter("clientId", id);
        query.executeUpdate();
    }
}
