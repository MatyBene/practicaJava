package org.hibernate.models;

import org.hibernate.interfaces.Discount;

public class Chair extends Furniture implements Discount {
    private Boolean wheels;

    public Chair(Integer stock, String name, Double price, Boolean wheels) {
        super(stock, name, price);
        this.wheels = wheels;
    }

    public Boolean getWheels() {
        return wheels;
    }

    public void setWheels(Boolean wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "wheels=" + wheels + ", " + super.toString();
    }

    @Override
    public void incrementPrice(Double percentage) {
        setPrice(getPrice() * (1 + percentage));
    }

    @Override
    public Double applyDiscount(Double percentage) {
        return getPrice() * (1 - percentage);
    }
}
