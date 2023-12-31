package com.joseph.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private Double total;
    private Date dateCmd = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
    private Status status;


    @OneToMany(mappedBy = "order")
    private List<LineOrder> lineOrders = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<LineOrder> getLineOrders() {
        return lineOrders;
    }

    public void setLineOrders(List<LineOrder> lineOrders) {
        this.lineOrders = lineOrders;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }

    public Order() {
    }

}
