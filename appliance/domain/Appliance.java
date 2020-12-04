package com.mirat.appliance.domain;

import java.util.Objects;

public abstract class Appliance {

    private String brand;
    private int price;

    public Appliance(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public abstract void switchOn();

    public abstract void switchOff();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Appliance that = (Appliance) o;
        return price == that.price
                && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

    @Override
    public String toString() {
        return "Appliances " + "Brand: " + brand + ", Price: " + price;
    }
}
