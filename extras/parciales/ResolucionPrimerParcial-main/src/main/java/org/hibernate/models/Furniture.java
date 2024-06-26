package org.hibernate.models;

public abstract class Furniture extends Product {

    public Furniture(Integer stock, String name, Double price) {
        super(stock, name, price);
    }
}
