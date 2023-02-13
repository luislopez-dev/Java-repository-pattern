package com.example.myapp.respository;

import com.example.myapp.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductDAOImpl {
    private final EntityManager entityManager;
    @Autowired
    public ProductDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<Product> findAll(Product product){
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from Product ", Product.class);
        List<Product> products = query.getResultList();
        return products;
    }
    public Product findById(int id){
        Session session = entityManager.unwrap(Session.class);
        Product product = session.get(Product.class, id);
        return product;
    }
    public void saveOrUpdate(Product product){
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);
    }
    public void delete(int id){
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from Product where id=:productId");
        query.setParameter("productId", id);
        query.executeUpdate();
    }
}
