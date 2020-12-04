package com.mirat.appliance.domain.major.cleaning;

import com.mirat.appliance_test.homeappliance.HomeAppliance;
import java.util.Objects;

public class VacuumCleaner extends HomeAppliance {

    private char filerType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(String brand, int price, int powerConsumption, char filerType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super(brand, price, powerConsumption);
        this.filerType = filerType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public void switchOn() {
        //Do something
    }

    @Override
    public void switchOff() {
        //Do something
    }

    public void clean() {
        //Do something
    }

    public char getFilerType() {
        return filerType;
    }

    public void setFilerType(char filerType) {
        this.filerType = filerType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
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
        VacuumCleaner that = (VacuumCleaner) o;
        return filerType == that.filerType
                && motorSpeedRegulation == that.motorSpeedRegulation
                && cleaningWidth == that.cleaningWidth
                && Objects.equals(bagType, that.bagType)
                && Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), filerType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "BRAND=" + getBrand() + " PRICE=" + getPrice() + ", POWER_CONSUMPTION=" + getPowerConsumption()
                + ", FILTER_TYPE=" + getFilerType() + ", BAG_TYPE=" + getBagType() + ", WAND_TYPE=" + getWandType()
                + ", MOTOR_SPEED_REGULATION=" + getMotorSpeedRegulation() + ", CLEANING_WIDTH=" + getCleaningWidth();
    }
}
