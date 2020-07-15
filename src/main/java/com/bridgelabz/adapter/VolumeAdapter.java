package com.bridgelabz.adapter;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.QuantityType;
import com.bridgelabz.utility.UnitName;

public class VolumeAdapter extends QuantityMeasurementAdapter{
    public ConversionType conversionType;
    public double convertValue;

    public enum VolumeUnit {
        GALLON,LITER
    }
    public VolumeAdapter() {
    }

    public double value;
    public UnitName unit;

    public VolumeAdapter(UnitName type, Double value) throws QuantityMeasurementException {
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
        return super.unitConverter(conversionType, this.convertValue);
    }
}
