package org.hibernate.models;

public abstract class Product {
    private Integer stock;
    private String name;
    private Double price;

    public Product(Integer stock, String name, Double price) {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "stock=" + stock +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
    public abstract void incrementPrice(Double percentage);
}
