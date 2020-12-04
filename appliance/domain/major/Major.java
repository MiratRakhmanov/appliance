package com.mirat.appliance.domain.major;

import com.mirat.appliance.domain.Appliance;
import java.util.Objects;

public abstract class Major extends Appliance {

    private int powerConsumption;

    public Major(String brand, int price, int powerConsumption) {
        super(brand, price);
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
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
        Major that = (Major) o;
        return powerConsumption == that.powerConsumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption);
    }

    @Override
    public String toString() {
        return "Major " + "Power Consumption: " + powerConsumption;
    }
}
