package com.happycoder.marketbackend.product;

public class Product {
    private final Long id;
    private final String name;
    private final int quantity;
    private final float price;

    public Product(Long id, String name, int quantity, float price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }
}
