package com.bridgelabz.adapter;

import com.bridgelabz.utility.ConversionType;

public class QuantityMeasurementFactory {
    public double loadConversionDetail(LengthAdapter.LengthUnit unit, ConversionType convertTo, double convertValue) {
        return new LengthAdapter().unitType(unit, convertTo, convertValue);
    }
}
