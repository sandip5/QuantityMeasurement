package com.bridgelabz.adapter;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.UnitName;

public class Temperature extends QuantityMeasurementAdapter {
    public ConversionType conversionType;
    public double convertValue;

    public Temperature() {
    }

    public double value;
    public UnitName unit;

    public Temperature(UnitName type, Double value) throws QuantityMeasurementException {
        try {
            this.unit = type;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null Value Provided",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }
    }


    @Override
    public double unitType(UnitName type, ConversionType convertTo, double convertValue) {
        this.conversionType = convertTo;
        this.convertValue = convertValue;
        return super.temperatureUnitConverter(conversionType, this.convertValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.convertValue, convertValue) == 0 &&
                Double.compare(that.value, value) == 0 &&
                conversionType == that.conversionType &&
                unit == that.unit;
    }
}

