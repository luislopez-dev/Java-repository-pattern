package com.example.myapp.respository;

import com.example.myapp.entity.Billing;

import java.util.List;

public interface BillingDAO {
    public void saveOrUpdate(Billing billing);
    public void delete(int id);
    public Billing findById(int id);
    public List<Billing> findAll();
}