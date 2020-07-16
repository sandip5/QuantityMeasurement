package com.bridgelabz.adapter;

import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.UnitName;

public class QuantityMeasurementFactory {
    public double loadConversionDetail(UnitName type, ConversionType convertTo, double convertValue) {
        return new Length().unitType(type, convertTo, convertValue);
    }
}
