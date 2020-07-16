package com.bridgelabz.adapter;

import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.QuantityType;
import com.bridgelabz.utility.UnitName;

public class QuantityMeasurementFactory {
    public double loadConversionDetail(QuantityType quantityType, UnitName type, ConversionType convertTo, double convertValue) {
        switch (quantityType) {
            case LENGTH:
                return new Length().unitType(type, convertTo, convertValue);
            case VOLUME:
                return new Volume().unitType(type, convertTo, convertValue);
            case WEIGHT:
                return new Weight().unitType(type, convertTo, convertValue);
            case TEMPERATURE:
                return new Temperature().unitType(type, convertTo, convertValue);
            default:
                throw new IllegalStateException("Unexpected value: " + quantityType);
        }
    }
}
