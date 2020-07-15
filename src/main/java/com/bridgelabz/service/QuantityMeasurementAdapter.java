package com.bridgelabz.service;

import com.bridgelabz.utility.ConversionType;

public class QuantityMeasurementAdapter {
    public double unitConverter(ConversionType convertTo, double convertValue) {
        double convertedValue = convertValue * convertTo.conversionFactor;
        return convertedValue;
    }
}
