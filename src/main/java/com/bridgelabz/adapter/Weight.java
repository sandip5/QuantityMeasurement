package com.bridgelabz.adapter;

import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.UnitName;

public class Weight extends QuantityMeasurementAdapter {
    public ConversionType conversionType;
    public double convertValue;

    @Override
    public double unitType(UnitName type, ConversionType convertTo, double convertValue) {
        this.conversionType = convertTo;
        this.convertValue = convertValue;
        return super.unitConverter(conversionType, this.convertValue);
    }
}
