package com.joseph.service;

import com.joseph.entity.Order;
import com.joseph.entity.Product;

import java.util.List;

public interface OrderService {
    public List<Order> getOrders();

    public void saveOrder(Order theOrder);

    public Order getOrder(Long id);

    public void deleteOrder(Long theId);
}
