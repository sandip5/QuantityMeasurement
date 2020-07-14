package com.bridgelabz.test;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.model.Feet;
import com.bridgelabz.model.Inch;
import com.bridgelabz.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;


public class QuantityMeasurementTest {

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInInches() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double numberInFeet = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.FEET_TO_INCH, numberInFeet);
        Assert.assertEquals(60.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_ShouldReturnEqual() throws QuantityMeasurementException {
        Feet firstFeet = new Feet(0.0);
        Feet secondFeet = new Feet(0.0);
        Assert.assertEquals(firstFeet, secondFeet);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheck() {
        try {
            Feet firstFeet = new Feet(null);
            Feet secondFeet = new Feet(0.0);
            Assert.assertEquals(firstFeet, secondFeet);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_ShouldReferenceCheck() throws QuantityMeasurementException {
        Feet firstFeet = new Feet(0.0);
        Feet secondFeet = new Feet(0.0);
        Assert.assertEquals(firstFeet, secondFeet);
    }

    @Test
    public void givenPerformTestForEquality_ShouldTypeCheck() throws QuantityMeasurementException {
        Feet firstFeet = new Feet(0.0);
        QuantityMeasurement secondFeet = new QuantityMeasurement(0.0);
        Assert.assertNotEquals(firstFeet.getClass(), secondFeet.getClass());
    }

    @Test
    public void givenPerformTestForEquality_ShouldValueCheck() throws QuantityMeasurementException {
        Feet firstFeet = new Feet(5.0);
        Feet secondFeet = new Feet(0.0);
        Assert.assertNotEquals(firstFeet, secondFeet);
    }

    @Test
    public void givenZeroInchAndZeroInch_ShouldReturnEqual() throws QuantityMeasurementException {
        Inch firstInch = new Inch(0.0);
        Inch secondInch = new Inch(0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheckForInch() {
        try {
            Inch firstInch = new Inch(null);
            Inch secondInch = new Inch(0.0);
            Assert.assertEquals(firstInch, secondInch);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_ShouldReferenceCheckForInch() throws QuantityMeasurementException {
        Inch firstInch = new Inch(0.0);
        Inch secondInch = new Inch(0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_ShouldTypeCheckForInch() throws QuantityMeasurementException {
        Inch firstInch = new Inch(0.0);
        QuantityMeasurement secondInch = new QuantityMeasurement(0.0);
        Assert.assertNotEquals(firstInch.getClass(), secondInch.getClass());
    }

    @Test
    public void givenPerformTestForEquality_ShouldValueCheckForInch() throws QuantityMeasurementException {
        Inch firstInch = new Inch(0.0);
        Inch secondInch = new Inch(5.0);
        Assert.assertNotEquals(firstInch, secondInch);
    }

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInYard() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 3.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneFeet_ShouldNotReturnOneYard() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneInch_ShouldNotReturnOneYard() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_ShouldNotReturnThirtySixInch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.YARD_TO_INCH, convertValue);
        Assert.assertEquals(36.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityThirtySixInch_ShouldNotReturnOneYard() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 36.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_ShouldNotReturnThreeFeet() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.YARD_TO_FEET, convertValue);
        Assert.assertEquals(3.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityTwoInch_ShouldNotReturnFiveCentiMeter() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 2.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.INCH_TO_CM, convertValue);
        Assert.assertEquals(5.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityFiveCentiMeter_ShouldNotReturnTwoInch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(ConversionType.CM_TO_INCH, convertValue);
        Assert.assertEquals(2.0, convertedQuantity, 0.0);
    }

}
