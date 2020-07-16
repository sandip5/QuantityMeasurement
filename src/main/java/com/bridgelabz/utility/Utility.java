package com.bridgelabz.utility;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.model.Quantity;

public class Utility {
    public boolean compare(Quantity firstLength, Quantity secondLength) throws QuantityMeasurementException {
        if (firstLength.unit.quantityType != secondLength.unit.quantityType)
            throw new QuantityMeasurementException("Values Types Not Matching And Conversion Not Possible",
                    QuantityMeasurementException
                            .ExceptionType.QUANTITY_TYPE_MISMATCH);
        return Double.compare(firstLength.value, secondLength.value) == 0;
    }


    public void checkNegativeValue(double convertValue) throws QuantityMeasurementException {
        if (convertValue < 0.0)
            throw new QuantityMeasurementException("Negative Value Not Accepted",
                    QuantityMeasurementException
                            .ExceptionType.NEGATIVE_VALUE);
    }

}

