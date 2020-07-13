package com.bridgelabz.service;

import com.bridgelabz.exception.QuantityMeasurementException;

public class Inch {
    private double valueInInch;

    public Inch(Double valueInInch) throws QuantityMeasurementException {
        try {
            this.valueInInch = valueInInch;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null Value Provided",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.valueInInch, valueInInch) == 0;
    }

}
