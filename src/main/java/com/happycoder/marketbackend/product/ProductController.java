package com.happycoder.marketbackend.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class ProductController {
    @GetMapping("/products")
    public ArrayList<Product> respond() {
        return new ArrayList<Product>() {{
            add(new Product(0L, "Pen", new Random().nextInt(100), 2.99f));
            add(new Product(1L, "Carrot", new Random().nextInt(100), 15f));
            add(new Product(2L, "Fairy", new Random().nextInt(100), 45.99f));
            add(new Product(3L, "Broccoli", new Random().nextInt(100), 25f));
            add(new Product(4L, "Fantola", new Random().nextInt(100), 39.99f));
        }};
    }
}
