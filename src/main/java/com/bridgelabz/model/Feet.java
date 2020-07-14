package com.bridgelabz.model;

import com.bridgelabz.exception.QuantityMeasurementException;

public class Feet {
    private double valueInFeet;

    public Feet(Double valueInFeet) throws QuantityMeasurementException {
        try {
            this.valueInFeet = valueInFeet;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null Value Provided",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.valueInFeet, valueInFeet) == 0;
    }
}
