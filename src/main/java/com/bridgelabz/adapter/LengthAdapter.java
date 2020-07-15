package com.bridgelabz.adapter;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;

public class LengthAdapter extends QuantityMeasurementAdapter {
    public LengthAdapter() {
    }

    public double value;
    public LengthUnit unit;

    public LengthAdapter(LengthUnit unit, Double value) throws QuantityMeasurementException {
        try {
            this.unit = unit;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null Value Provided",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }

    public enum LengthUnit {
        FEET, INCH, YARD, CM
    }

    public LengthUnit lengthUnit;
    public double convertValue;
    public ConversionType conversionType;

    @Override
    public double unitType(LengthUnit unit, ConversionType convertTo, double convertValue) {
        this.conversionType = convertTo;
        this.lengthUnit = unit;
        this.convertValue = convertValue;
        return super.unitConverter(conversionType, this.convertValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthAdapter that = (LengthAdapter) o;
        return Double.compare(that.value, value) == 0 &&
                Double.compare(that.convertValue, convertValue) == 0 &&
                unit == that.unit &&
                lengthUnit == that.lengthUnit &&
                conversionType == that.conversionType;
    }
}
