package com.bridgelabz.model;

import com.bridgelabz.exception.QuantityMeasurementException;

public class Length {
    public enum Unit{
        FEET, INCH, YARD, CM
    }

    public Unit unit;


    private double value;

    public Length(Unit unit, Double value) throws QuantityMeasurementException {
        try {
            this.unit = unit;
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
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0;
    }
}
