package com.example.myapp.respository;

import com.example.myapp.entity.Billing;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillingDAOImpl {
    private final EntityManager entityManager;
    @Autowired
    public BillingDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<Billing> findAll(Billing billing){
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from Billing", Billing.class);
        List<Billing> billings = query.getResultList();
        return billings;
    }
    public Billing findById(int id){
        Session session = entityManager.unwrap(Session.class);
        Billing billing = session.get(Billing.class, id);
        return billing;
    }
    public void saveOrUpdate(Billing billing){
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(billing);
    }
    public void delete(int id){
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from Billing where id=:billingId");
        query.setParameter("billingId", id);
        query.executeUpdate();
    }
}
