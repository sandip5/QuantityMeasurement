package com.bridgelabz.adapter;

import com.bridgelabz.enums.ConversionType;
import com.bridgelabz.enums.UnitName;

public class Temperature extends QuantityMeasurementAdapter {
    public ConversionType conversionType;
    public double convertValue;

    @Override
    public double unitType(UnitName type, ConversionType convertTo, double convertValue) {
        this.conversionType = convertTo;
        this.convertValue = convertValue;
        return super.temperatureUnitConverter(conversionType, this.convertValue);
    }
}

