package com.mirat.appliance.domain.major.sound;

import com.mirat.appliance.domain.major.Major;

import java.util.Objects;

public class Speaker extends Major {

    private int numberOfSpeakers;
    private Range frequencyRange;
    private int cordLength;

    public Speaker(String brand, int price, int powerConsumption, int numberOfSpeakers, Range frequencyRange, int cordLength) {
        super(brand, price, powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public void switchOn() {
        //Do something
    }

    @Override
    public void switchOff() {
        //Do something
    }

    public void playSound() {
        //Do something
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public Range getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(Range frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
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
        Speaker speaker = (Speaker) o;
        return numberOfSpeakers == speaker.numberOfSpeakers
                && cordLength == speaker.cordLength
                && Objects.equals(frequencyRange, speaker.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "BRAND=" + getBrand() + ", PRICE=" + getPrice() + ", POWER_CONSUMPTION=" + getPowerConsumption()
                + ", NUMBER_OF_SPEAKERS=" + getNumberOfSpeakers() + ", FREQUENCY_RANGE=" + getFrequencyRange()
                + ", CORD_LENGTH=" + getCordLength();
    }
}
