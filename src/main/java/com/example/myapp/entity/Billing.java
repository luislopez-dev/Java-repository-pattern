package com.example.myapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "billings")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nit")
    private String nit;

    @Column(name = "taxes")
    private float taxes;

    @Column(name = "discount")
    private float discount;

    @Column(name = "total")
    private float total;

    public Billing() {
    }

    public Billing(int id, String nit, float taxes, float discount, float total) {
        this.id = id;
        this.nit = nit;
        this.taxes = taxes;
        this.discount = discount;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", taxes=" + taxes +
                ", discount=" + discount +
                ", total=" + total +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public float getTaxes() {
        return taxes;
    }

    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}