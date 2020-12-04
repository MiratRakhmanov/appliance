package com.mirat.appliance.domain.major.kitchen;

import java.util.Objects;

public class Refrigerator extends Kitchen {

    private int freezerCapacity;
    private double overallCapacity;

    public Refrigerator(String brand, int price, int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width) {
        super(brand, price, powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    @Override
    public void switchOn() {
        //Do something
    }

    @Override
    public void switchOff() {
        //Do something
    }

    public void refrigerate() {
        //Do something
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Refrigerator that = (Refrigerator) o;
        return freezerCapacity == that.freezerCapacity
                && Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freezerCapacity, overallCapacity);
    }

    @Override
    public String toString() {
        return "BRAND=" + getBrand() + ", PRICE=" + getPrice() + ", POWER_CONSUMPTION=" + getPowerConsumption()
                + ", WEIGHT=" + getWeight() + ", FREEZER_CAPACITY=" + getFreezerCapacity() + ", OVERALL_CAPACITY=" + getOverallCapacity()
                + " HEIGHT=" + getHeight() + " WIDTH=" + getWidth();
    }
}
