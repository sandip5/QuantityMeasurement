package com.bridgelabz.service;

import com.bridgelabz.adapter.QuantityMeasurementFactory;
import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.QuantityType;

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

    public double unitConverter(QuantityType unit, ConversionType convertTo, double convertValue) throws QuantityMeasurementException {
        return new QuantityMeasurementFactory().loadConversionDetail(unit, convertTo, convertValue);
    }
}
