package com.happycoder.marketbackend.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(@Autowired OrderRepository repository){
        this.repository = repository;
    }

    public List<Order> getOrders(){
        return repository.findAll();
    }

    public void saveOrder(Order order){
        repository.save(order);
    }

}
