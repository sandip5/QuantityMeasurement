package com.bridgelabz.service;

import com.bridgelabz.adapter.LengthAdapter;
import com.bridgelabz.adapter.QuantityMeasurementFactory;
import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;

public class QuantityMeasurement {

    public QuantityMeasurement() {
    }

    /**
     * UnitConverter Convert One Length Unit To Another Length Unit
     *
     * @param unit
     * @param convertTo
     * @param convertValue
     * @return convertedValue
     */

    public double unitConverter(LengthAdapter.LengthUnit unit, ConversionType convertTo, double convertValue) throws QuantityMeasurementException {
        return new QuantityMeasurementFactory().loadConversionDetail(unit, convertTo, convertValue);
    }
}
