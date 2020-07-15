package com.bridgelabz.adapter;

import com.bridgelabz.utility.ConversionType;

public abstract class QuantityMeasurementAdapter {
    public abstract double unitType(ConversionType convertTo, double convertValue);

    public double unitConverter(ConversionType convertTo, double convertValue) {
        double convertedValue = convertValue * convertTo.conversionFactor;
        return convertedValue;
    }
}
