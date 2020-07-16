package com.bridgelabz.adapter;

import com.bridgelabz.enums.ConversionType;
import com.bridgelabz.enums.QuantityType;
import com.bridgelabz.enums.UnitName;

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
