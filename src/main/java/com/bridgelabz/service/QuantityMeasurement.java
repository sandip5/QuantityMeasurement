package com.bridgelabz.service;

public class QuantityMeasurement {
    public double value;
    private double numberInFeet;

    public QuantityMeasurement() {

    }

    public QuantityMeasurement(double value) {
        this.value = value;
    }

    public double unitConverter(ConversionType convertTo, double convertValue) {
        double convertedValue = convertValue * convertTo.conversionFactor;
        return convertedValue;
    }
}
