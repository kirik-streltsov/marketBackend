package com.happycoder.marketbackend.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    @GetMapping
    public List<Order> getOrders(){
        return service.getOrders();
    }

    @PostMapping
    public void addOrder(@RequestBody Order order){
        service.saveOrder(order);
    }

    public OrderController(@Autowired OrderService service){
        this.service = service;
    }

}
