package com.bridgelabz.adapter;

import com.bridgelabz.enums.ConversionType;
import com.bridgelabz.enums.UnitName;

public abstract class QuantityMeasurementAdapter {
    public abstract double unitType(UnitName type, ConversionType convertTo, double convertValue);

    public double unitConverter(ConversionType convertTo, double convertValue) {
        double convertedValue = convertValue * convertTo.conversionFactor;
        return convertedValue;
    }

    public double temperatureUnitConverter(ConversionType convertTo, double convertValue) {
        switch (convertTo) {
            case FAHRENHEIT_TO_CELSIUS:
                return (convertValue - convertTo.constantFactor) * convertTo.conversionFactor;
            case CELSIUS_TO_FAHRENHEIT:
                return (convertValue * convertTo.conversionFactor) + convertTo.constantFactor;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
    }
}
