package com.mirat.appliance.domain.electronic;

import com.mirat.appliance.domain.Appliance;
import java.util.Objects;

public abstract class PortableElectronic extends Appliance {

    private double displayInches;
    private int batteryCapacity;
    private int memoryRam;

    public PortableElectronic(String brand, int price, double displayInches, int batteryCapacity, int memoryRam) {
        super(brand, price);
        this.displayInches = displayInches;
        this.batteryCapacity = batteryCapacity;
        this.memoryRam = memoryRam;
    }

    public abstract void boostProcessor();

    public abstract void expandMemory();

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
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
        PortableElectronic that = (PortableElectronic) o;
        return Double.compare(that.displayInches, displayInches) == 0
                && batteryCapacity == that.batteryCapacity
                && memoryRam == that.memoryRam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), displayInches, batteryCapacity, memoryRam);
    }

    @Override
    public String toString() {
        return "PortableComputer " + "Display Inches: " + displayInches + ", Battery Capacity: " + batteryCapacity
                + ", Memory Ram: " + memoryRam;
    }
}
