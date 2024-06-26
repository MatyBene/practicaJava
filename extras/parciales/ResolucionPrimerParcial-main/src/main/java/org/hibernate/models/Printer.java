package org.hibernate.models;

import org.hibernate.interfaces.Discount;

public class Printer extends ITProduct implements Discount {
    private Double printsPerMinute;

    public Printer(Integer stock, String name, Double price, String manufacturer, Double printsPerMinute) {
        super(stock, name, price, manufacturer);
        this.printsPerMinute = printsPerMinute;
    }

    public Double getPrintsPerMinute() {
        return printsPerMinute;
    }

    public void setPrintsPerMinute(Double printsPerMinute) {
        this.printsPerMinute = printsPerMinute;
    }

    @Override
    public String toString() {
        return "printsPerMinute=" + printsPerMinute + ", " + super.toString();
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
