package org.hibernate.models;

public class Notebook extends ITProduct {
    private Integer memory;

    public Notebook(Integer stock, String name, Double price, String manufacturer, Integer memory) {
        super(stock, name, price, manufacturer);
        this.memory = memory;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return
                "memory=" + memory + ", " + super.toString();
    }

    @Override
    public void incrementPrice(Double percentage) {
        setPrice(getPrice() * (1 + percentage));
    }
}
