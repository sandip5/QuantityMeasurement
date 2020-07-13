package com.bridgelabz.service;

public class Feet {
    private final double valueInFeet;

    public Feet(Double valueInFeet) {
        this.valueInFeet = valueInFeet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.valueInFeet, valueInFeet) == 0;
    }
}
