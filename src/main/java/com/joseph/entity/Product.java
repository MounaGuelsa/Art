package com.joseph.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "price")
    private String price;

    @Column(name = "stock")
    private String stock;

    @OneToMany(mappedBy = "product")
    private List<LineOrder> lineOrders = new ArrayList<>();

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String prix) {
        this.price = prix;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", prix='" + price + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}

