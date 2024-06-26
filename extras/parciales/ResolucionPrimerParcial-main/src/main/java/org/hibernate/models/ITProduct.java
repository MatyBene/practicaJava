package org.hibernate.models;

public abstract class ITProduct extends Product {
    private String manufacturer;

    public ITProduct(Integer stock, String name, Double price, String manufacturer) {
        super(stock, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return
                "manufacturer= " + manufacturer + ", " + super.toString();
    }
}
