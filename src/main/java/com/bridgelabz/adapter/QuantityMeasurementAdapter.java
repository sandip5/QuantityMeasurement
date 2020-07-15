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
}
