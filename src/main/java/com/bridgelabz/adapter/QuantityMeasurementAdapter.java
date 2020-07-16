package com.bridgelabz.adapter;

import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.QuantityType;
import com.bridgelabz.utility.UnitName;

public abstract class QuantityMeasurementAdapter {
    public abstract double unitType(UnitName type, ConversionType convertTo, double convertValue);

    public double unitConverter(ConversionType convertTo, double convertValue) {
        double convertedValue = convertValue * convertTo.conversionFactor;
        return convertedValue;
    }

    public double temperatureUnitConverter(ConversionType convertTo, double convertValue){
        switch (convertTo){
            case FAHRENHEIT_TO_CELSIUS:
                return  ( convertValue - 32.0 ) * (5d/9d);
            case CELSIUS_TO_FAHRENHEIT:
                return ( convertValue * ( 9d/5d ) ) + 32;
            default:
                throw new IllegalStateException("Unexpected value: " + convertTo);
        }
    }
}
