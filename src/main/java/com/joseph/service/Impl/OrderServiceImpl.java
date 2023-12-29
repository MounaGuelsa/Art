package com.joseph.service.Impl;

import com.joseph.entity.Order;
import com.joseph.entity.Product;
import com.joseph.repository.OrderRepository;
import com.joseph.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void saveOrder(Order theOrder) {
        orderRepository.save(theOrder);
    }

    @Override
    public Order getOrder(Long id) {
        return null;
    }

    @Override
    public void deleteOrder(Long theId) {
        orderRepository.deleteById(theId);
    }
}
