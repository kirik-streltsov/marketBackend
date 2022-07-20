package com.happycoder.marketbackend.models;

import java.util.ArrayList;
import java.util.Random;

public class ProductListResponse {

    private final ArrayList<Product> productList;


    public ProductListResponse(){
        productList = new ArrayList<Product>(){{
            add(new Product("Pen", new Random().nextInt(100), 2.99f));
            add(new Product("Carrot", new Random().nextInt(100), 15f));
            add(new Product("Fairy", new Random().nextInt(100), 45.99f));
            add(new Product("Broccoli", new Random().nextInt(100), 25f));
            add(new Product("Fantola", new Random().nextInt(100), 39.99f)); }};
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
}
