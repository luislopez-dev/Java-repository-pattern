package com.example.myapp.service;

import com.example.myapp.entity.Billing;

import java.util.List;

public interface BillingService {
    public void saveOrUpdate(Billing billing);
    public void delete(int id);
    public Billing findById(int id);
    public List<Billing> findAll();
}
