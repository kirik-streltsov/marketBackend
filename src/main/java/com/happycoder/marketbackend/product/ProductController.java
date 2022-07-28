package com.happycoder.marketbackend.product;

import com.happycoder.marketbackend.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class ProductController {
    @GetMapping("/products")
    public ArrayList<Product> respond() {
        return new ArrayList<Product>() {{
            add(new Product("Pen", new Random().nextInt(100), 2.99f));
            add(new Product("Carrot", new Random().nextInt(100), 15f));
            add(new Product("Fairy", new Random().nextInt(100), 45.99f));
            add(new Product("Broccoli", new Random().nextInt(100), 25f));
            add(new Product("Fantola", new Random().nextInt(100), 39.99f));
        }};
    }
}
