package com.happycoder.marketbackend.controllers;

import com.happycoder.marketbackend.models.ProductListResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products")
    public ProductListResponse respond() {
        return new ProductListResponse();
    }
}
