package com.mirat.appliance.domain.major.kitchen;

import com.mirat.appliance.domain.major.Major;
import java.util.Objects;

public abstract class Kitchen extends Major {

    private int weight;
    private double height;
    private double width;

    public Kitchen(String brand, int price, int powerConsumption, int weight, double height, double width) {
        super(brand, price, powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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
        Kitchen that = (Kitchen) o;
        return weight == that.weight
                && Double.compare(that.height, height) == 0
                && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, height, width);
    }

    @Override
    public String toString() {
        return "Kitchen Appliance: " + "Weight: " + weight + ", Height: " + height + ", Width: " + width;
    }
}
