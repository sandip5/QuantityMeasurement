package com.bridgelabz.test;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.model.Length;
import com.bridgelabz.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;


public class QuantityMeasurementTest {

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInInches() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value = 5.0;
        Length length = new Length(Length.Unit.FEET, value);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.FEET_TO_INCH, value);
        Assert.assertEquals(60.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_ShouldReturnEqual() throws QuantityMeasurementException {
        Length firstLength = new Length(Length.Unit.FEET,0.0);
        Length secondLength = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(firstLength, secondLength);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheck() {
        try {
            Length firstLength = new Length(Length.Unit.FEET, null);
            Length secondLength = new Length(Length.Unit.FEET, 0.0);
            Assert.assertEquals(firstLength, secondLength);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_ShouldReferenceCheck() throws QuantityMeasurementException {
        Length firstLength = new Length(Length.Unit.FEET, 0.0);
        Length secondLength = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(firstLength, secondLength);
    }

    @Test
    public void givenPerformTestForEquality_ShouldTypeCheck() throws QuantityMeasurementException {
        Length firstLength = new Length(Length.Unit.FEET, 0.0);
        Length secondFeet = new Length(Length.Unit.INCH,0.0);
        Assert.assertNotEquals(firstLength.unit, secondFeet.unit);
    }

    @Test
    public void givenPerformTestForEquality_ShouldValueCheck() throws QuantityMeasurementException {
        Length firstLength = new Length(Length.Unit.FEET, 5.0);
        Length secondLength = new Length(Length.Unit.FEET, 0.0);
        Assert.assertNotEquals(firstLength, secondLength);
    }

    @Test
    public void givenZeroInchAndZeroInch_ShouldReturnEqual() throws QuantityMeasurementException {
        Length firstInch = new Length(Length.Unit.INCH,0.0);
        Length secondInch = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheckForInch() {
        try {
            Length firstInch = new Length(Length.Unit.INCH,null);
            Length secondInch = new Length(Length.Unit.INCH,0.0);
            Assert.assertEquals(firstInch, secondInch);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_ShouldReferenceCheckForInch() throws QuantityMeasurementException {
        Length firstInch = new Length(Length.Unit.INCH,0.0);
        Length secondInch = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_ShouldTypeCheckForInch() throws QuantityMeasurementException {
        Length firstInch = new Length(Length.Unit.INCH,0.0);
        Length secondInch = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals(firstInch.unit, secondInch.unit);
    }

    @Test
    public void givenPerformTestForEquality_ShouldValueCheckForInch() throws QuantityMeasurementException {
        Length firstInch = new Length(Length.Unit.INCH,0.0);
        Length secondInch = new Length(Length.Unit.INCH,5.0);
        Assert.assertNotEquals(firstInch, secondInch);
    }

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInYard() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 3.0;
        Length length = new Length(Length.Unit.FEET, convertValue);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneFeet_ShouldNotReturnOneYard() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        Length length = new Length(Length.Unit.FEET, convertValue);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneInch_ShouldNotReturnOneYard() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        Length length = new Length(Length.Unit.FEET, convertValue);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_ShouldReturnThirtySixInch() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        Length length = new Length(Length.Unit.FEET, convertValue);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.YARD_TO_INCH, convertValue);
        Assert.assertEquals(36.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityThirtySixInch_ShouldReturnOneYard() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 36.0;
        Length length = new Length(Length.Unit.FEET, convertValue);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_ShouldNotReturnThreeFeet() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        Length length = new Length(Length.Unit.FEET, convertValue);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.YARD_TO_FEET, convertValue);
        Assert.assertEquals(3.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityTwoInch_ShouldNotReturnFiveCentiMeter() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 2.0;
        Length length = new Length(Length.Unit.FEET, convertValue);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.INCH_TO_CM, convertValue);
        Assert.assertEquals(5.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityFiveCentiMeter_ShouldNotReturnTwoInch() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 5.0;
        Length length = new Length(Length.Unit.FEET, convertValue);
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.CM_TO_INCH, convertValue);
        Assert.assertEquals(2.0, convertedQuantity, 0.0);
    }

}
