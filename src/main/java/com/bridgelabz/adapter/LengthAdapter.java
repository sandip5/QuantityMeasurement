package com.bridgelabz.adapter;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.QuantityType;
import com.bridgelabz.utility.UnitName;

import java.util.Objects;

public class LengthAdapter extends QuantityMeasurementAdapter {

    public double value;
    public UnitName unit;

    public LengthAdapter(UnitName type, Double value) throws QuantityMeasurementException {
        try {
            this.unit = type;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null Value Provided",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }
    public double convertValue;
    public ConversionType conversionType;

    public LengthAdapter() {

    }

    @Override
    public double unitType(UnitName type, ConversionType convertTo, double convertValue) {
        this.conversionType = convertTo;
        this.convertValue = convertValue;
        return super.unitConverter(conversionType, this.convertValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthAdapter that = (LengthAdapter) o;
        return Double.compare(that.convertValue, convertValue) == 0 &&
                Objects.equals(value, that.value) &&
                unit == that.unit &&
                conversionType == that.conversionType;
    }
}
