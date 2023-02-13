package com.example.myapp.service;

import com.example.myapp.entity.Billing;
import com.example.myapp.respository.BillingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BillingServiceImpl implements BillingService {
    private final BillingDAO billingDAO;

    @Autowired
    public BillingServiceImpl(BillingDAO billingDAO) {
        this.billingDAO = billingDAO;
    }

    @Transactional
    @Override
    public void saveOrUpdate(Billing billing) {
        billingDAO.saveOrUpdate(billing);
    }

    @Transactional
    @Override
    public void delete(int id) {
        billingDAO.delete(id);
    }

    @Transactional
    @Override
    public Billing findById(int id) {
        return billingDAO.findById(id);
    }

    @Transactional
    @Override
    public List<Billing> findAll()
    {
        return billingDAO.findAll();
    }
}
