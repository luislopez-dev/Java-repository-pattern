package com.example.myapp.respository;

import com.example.myapp.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDAOImpl {
    private final EntityManager entityManager;
    @Autowired
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<User> findAll(User user){
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from User ", User.class);
        List<User> users = query.getResultList();
        return users;
    }
    public User findById(int id){
        Session session = entityManager.unwrap(Session.class);
        User user = session.get(User.class, id);
        return user;
    }
    public void saveOrUpdate(User user){
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }
    public void delete(int id){
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from User where id=:userId");
        query.setParameter("userId", id);
        query.executeUpdate();
    }
}
