package com.bridgelabz.service;

import com.bridgelabz.adapter.QuantityMeasurementFactory;
import com.bridgelabz.enums.ConversionType;
import com.bridgelabz.enums.QuantityType;
import com.bridgelabz.enums.UnitName;
import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.Utility;

public class QuantityMeasurement {

    public QuantityMeasurement() {
    }

    /**
     * UnitConverter Convert One Length Unit To Another Length Unit
     *
     * @param quantityType
     * @param unit
     * @param convertTo
     * @param convertValue
     * @return convertedValue
     */

    public double unitConverter(QuantityType quantityType, UnitName unit,
                                ConversionType convertTo, double convertValue)
            throws QuantityMeasurementException {
        new Utility().checkNegativeValue(convertValue);
        return new QuantityMeasurementFactory().loadConversionDetail(quantityType, unit, convertTo, convertValue);
    }

    /**
     * Addition Method
     *
     * @param firstValue
     * @param secondValue
     * @return
     */
    public double addition(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
