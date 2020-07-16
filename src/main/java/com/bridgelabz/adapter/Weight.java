package com.bridgelabz.adapter;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.UnitName;

public class Weight {
    public ConversionType conversionType;
    public double convertValue;

    public enum WeightUnit {
        KG, GRAM, TONNES
    }
    public Weight() {
    }

    public double value;
    public UnitName unit;

    public Weight(UnitName type, Double value) throws QuantityMeasurementException {
        try {
            this.unit = type;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null Value Provided",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.convertValue, convertValue) == 0 &&
                Double.compare(weight.value, value) == 0 &&
                conversionType == weight.conversionType &&
                unit == weight.unit;
    }
}
