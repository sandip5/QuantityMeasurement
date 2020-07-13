package com.bridgelabz.service;

public class QuantityMeasurement {
    public double value;
    private double numberInFeet;

    public QuantityMeasurement(double value) {
        this.value = value;
    }

    public double unitConverter(double numberInFeet) {
        this.numberInFeet = numberInFeet;
        double numberInInches = numberInFeet * 12;
        return numberInInches;
    }

    public double unitConverter(ConversionType convertTo, double convertValue) {
        return 0.0;

    }
}
