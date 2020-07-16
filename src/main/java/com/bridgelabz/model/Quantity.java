package com.bridgelabz.model;

import com.bridgelabz.enums.UnitName;
import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.Utility;

public class Quantity {
    public double value;
    public UnitName unit;

    public Quantity(UnitName type, Double value) throws QuantityMeasurementException {
        try {
            this.unit = type;
            this.value = value;
            new Utility().checkNegativeValue(value);
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null Value Provided",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 &&
                unit == quantity.unit;
    }
}
