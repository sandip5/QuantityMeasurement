package com.bridgelabz.test;

import com.bridgelabz.adapter.LengthAdapter;
import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.utility.ConversionType;
import org.junit.Assert;
import org.junit.Test;


public class QuantityMeasurementTest {

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInInches() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.FEET,
                ConversionType.FEET_TO_INCH, value);
        Assert.assertEquals(60.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_ShouldReturnEqual() throws QuantityMeasurementException {
        LengthAdapter firstLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 0.0);
        LengthAdapter secondLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 0.0);
        Assert.assertEquals(firstLength, secondLength);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheck() {
        try {
            LengthAdapter firstLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, null);
            LengthAdapter secondLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 0.0);
            Assert.assertEquals(firstLength, secondLength);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_ShouldReferenceCheck() throws QuantityMeasurementException {
        LengthAdapter firstLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 0.0);
        LengthAdapter secondLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 0.0);
        Assert.assertEquals(firstLength, secondLength);
    }

    @Test
    public void givenPerformTestForEquality_ShouldTypeCheck() throws QuantityMeasurementException {
        LengthAdapter firstLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 0.0);
        LengthAdapter secondFeet = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 0.0);
        Assert.assertNotEquals(firstLength.unit, secondFeet.unit);
    }

    @Test
    public void givenPerformTestForEquality_ShouldValueCheck() throws QuantityMeasurementException {
        LengthAdapter firstLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 5.0);
        LengthAdapter secondLength = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 0.0);
        Assert.assertNotEquals(firstLength, secondLength);
    }

    @Test
    public void givenZeroInchAndZeroInch_ShouldReturnEqual() throws QuantityMeasurementException {
        LengthAdapter firstInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 0.0);
        LengthAdapter secondInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheckForInch() {
        try {
            LengthAdapter firstInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, null);
            LengthAdapter secondInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 0.0);
            Assert.assertEquals(firstInch, secondInch);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_ShouldReferenceCheckForInch() throws QuantityMeasurementException {
        LengthAdapter firstInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 0.0);
        LengthAdapter secondInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_ShouldTypeCheckForInch() throws QuantityMeasurementException {
        LengthAdapter firstInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 0.0);
        LengthAdapter secondInch = new LengthAdapter(LengthAdapter.LengthUnit.FEET, 0.0);
        Assert.assertNotEquals(firstInch.unit, secondInch.unit);
    }

    @Test
    public void givenPerformTestForEquality_ShouldValueCheckForInch() throws QuantityMeasurementException {
        LengthAdapter firstInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 0.0);
        LengthAdapter secondInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 5.0);
        Assert.assertNotEquals(firstInch, secondInch);
    }

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInYard() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 3.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.FEET,
                ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneFeet_ShouldNotReturnOneYard() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.FEET,
                ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneInch_ShouldNotReturnOneYard() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.INCH,
                ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_ShouldReturnThirtySixInch() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.YARD,
                ConversionType.YARD_TO_INCH, convertValue);
        Assert.assertEquals(36.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityThirtySixInch_ShouldReturnOneYard() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 36.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.INCH,
                ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_ShouldNotReturnThreeFeet() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.YARD,
                ConversionType.YARD_TO_FEET, convertValue);
        Assert.assertEquals(3.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityTwoInch_ShouldNotReturnFiveCentiMeter() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 2.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.CM,
                ConversionType.INCH_TO_CM, convertValue);
        Assert.assertEquals(5.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityFiveCentiMeter_ShouldNotReturnTwoInch() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.CM,
                ConversionType.CM_TO_INCH, convertValue);
        Assert.assertEquals(2.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityTwoInchAndTwoInch_WhenAdded_ShouldNotReturnFourInch() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        LengthAdapter firstInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 2.0);
        LengthAdapter secondInch = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 2.0);
        double total = firstInch.value + secondInch.value;
        Assert.assertEquals(4.0, total, 0.0);
    }

    @Test
    public void givenQuantityOneFeetAndTwoInch_WhenAdded_ShouldNotReturnFourteenInch() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.FEET,
                ConversionType.FEET_TO_INCH, convertValue);
        LengthAdapter secondValue = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 2.0);
        double total = firstValue + secondValue.value;
        Assert.assertEquals(14.0, total, 0.0);
    }

    @Test
    public void givenQuantityOneFeetAndOneFeet_WhenAdded_ShouldNotReturnFourteenInch() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double firstConvertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.FEET,
                ConversionType.FEET_TO_INCH, firstConvertValue);
        double secondConvertValue = 1.0;
        double secondValue = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.FEET,
                ConversionType.FEET_TO_INCH, secondConvertValue);
        double total = firstValue + secondValue;
        Assert.assertEquals(24.0, total, 0.0);
    }

    @Test
    public void givenQuantity2InchAnd2AndHalfCM_WhenAdded_ShouldNotReturnThreeInch() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        LengthAdapter firstValue = new LengthAdapter(LengthAdapter.LengthUnit.INCH, 2.0);
        double secondConvertValue = 5d/2d;
        double secondValue = quantityMeasurement.unitConverter(LengthAdapter.LengthUnit.CM,
                ConversionType.CM_TO_INCH, secondConvertValue);
        double total = firstValue.value + secondValue;
        Assert.assertEquals(3.0, total, 0.0);
    }





}
