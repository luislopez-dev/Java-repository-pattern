package com.example.myapp.controller;

import com.example.myapp.entity.Billing;
import com.example.myapp.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("billing")
public class BillingController {
    private final BillingService billingService;
    @Autowired
    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }
    @GetMapping
    public List<Billing> findAll(){
        return billingService.findAll();
    }
    @GetMapping("{id}")
    public Billing findById(@PathVariable int id){
        return billingService.findById(id);
    }
    @PostMapping
    public Billing save(@RequestBody Billing billing){
        billingService.saveOrUpdate(billing);
        return billing;
    }
    @PutMapping
    public Billing update(@RequestBody Billing billing){
        billingService.saveOrUpdate(billing);
        return billing;
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        billingService.delete(id);
        return "User deleted";
    }
}
