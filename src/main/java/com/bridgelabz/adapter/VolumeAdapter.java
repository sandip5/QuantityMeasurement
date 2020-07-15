package com.bridgelabz.adapter;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;

public class VolumeAdapter extends QuantityMeasurementAdapter{
    public ConversionType conversionType;
    public double convertValue;

    public enum VolumeUnit {
        GALLON,LITER
    }
    public VolumeAdapter() {
    }

    public double value;
    public VolumeAdapter.VolumeUnit unit;

    public VolumeAdapter(VolumeAdapter.VolumeUnit unit, Double value) throws QuantityMeasurementException {
        try {
            this.unit = unit;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null Value Provided",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }

    @Override
    public double unitType(ConversionType convertTo, double convertValue) {
        this.conversionType = convertTo;
        this.convertValue = convertValue;
        return super.unitConverter(conversionType, this.convertValue);
    }
}
