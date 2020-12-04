package com.mirat.appliance.domain.major.sound;

import java.util.Objects;

public class Range {

    private double low;
    private double high;

    public Range(double low, double high) {
        this.low = low;
        this.high = high;
    }

    public boolean contains(int number) {
        return (number >= low && number <= high);
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Range range = (Range) o;
        return Double.compare(range.low, low) == 0
                && Double.compare(range.high, high) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(low, high);
    }

    @Override
    public String toString() {
        return "Range " + "Low: " + low + ", High: " + high;
    }
}
