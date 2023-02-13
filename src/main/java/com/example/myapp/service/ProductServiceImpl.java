package com.example.myapp.service;

import com.example.myapp.entity.Product;
import com.example.myapp.respository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Transactional
    @Override
    public void saveOrUpdate(Product product) {
        productDAO.saveOrUpdate(product);
    }

    @Transactional
    @Override
    public void delete(int id) {
        productDAO.delete(id);
    }

    @Transactional
    @Override
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    @Transactional
    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }
}
