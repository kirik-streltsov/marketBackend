package com.happycoder.marketbackend.models;

public class Product {
    private final String name;
    private final int quantity;
    private final float price;

    public Product(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
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
