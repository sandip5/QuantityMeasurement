package com.bridgelabz.service;

import com.bridgelabz.utility.ConversionType;

public class QuantityMeasurement {
    public double value;

    public QuantityMeasurement() { }

    public QuantityMeasurement(double value) {
        this.value = value;
    }

    /**
     * UnitConverter Convert One Length Unit To Another Length Unit
     *
     * @param convertTo
     * @param convertValue
     * @return convertedValue
     */

    public double unitConverter(ConversionType convertTo, double convertValue) {
        double convertedValue = convertValue * convertTo.conversionFactor;
        return convertedValue;
    }
}
