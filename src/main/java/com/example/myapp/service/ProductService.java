package com.example.myapp.service;

import com.example.myapp.entity.Product;

import java.util.List;

public interface ProductService {
    public void saveOrUpdate(Product product);
    public void delete(int id);
    public Product findById(int id);
    public List<Product> findAll();
}
