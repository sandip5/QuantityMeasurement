package com.bridgelabz.adapter;

import com.bridgelabz.enums.ConversionType;
import com.bridgelabz.enums.UnitName;

public class Length extends QuantityMeasurementAdapter {

    public double convertValue;
    public ConversionType conversionType;

    @Override
    public double unitType(UnitName type, ConversionType convertTo, double convertValue) {
        this.conversionType = convertTo;
        this.convertValue = convertValue;
        return super.unitConverter(conversionType, this.convertValue);
    }

}
