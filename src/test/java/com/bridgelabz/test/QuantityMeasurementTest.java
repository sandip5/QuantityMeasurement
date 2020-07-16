package com.bridgelabz.test;

import com.bridgelabz.adapter.Length;
import com.bridgelabz.adapter.Volume;
import com.bridgelabz.adapter.Weight;
import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.QuantityType;
import com.bridgelabz.utility.UnitName;
import org.junit.Assert;
import org.junit.Test;


public class QuantityMeasurementTest {

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInInches()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.FEET,
                ConversionType.FEET_TO_INCH, value);
        Assert.assertEquals(60.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_ShouldReturnEqual()
            throws QuantityMeasurementException {
        Length firstLength = new Length(UnitName.FEET, 0.0);
        Length secondLength = new Length(UnitName.FEET, 0.0);
        Assert.assertEquals(firstLength, secondLength);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheck() {
        try {
            Length firstLength = new Length(UnitName.FEET, null);
            Length secondLength = new Length(UnitName.FEET, 0.0);
            Assert.assertEquals(firstLength, secondLength);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_ShouldReferenceCheck()
            throws QuantityMeasurementException {
        Length firstLength = new Length(UnitName.FEET, 0.0);
        Length secondLength = new Length(UnitName.FEET, 0.0);
        Assert.assertEquals(firstLength, secondLength);
    }

    @Test
    public void givenPerformTestForEquality_ShouldTypeCheck() throws QuantityMeasurementException {
        Length firstLength = new Length(UnitName.FEET, 0.0);
        Length secondFeet = new Length(UnitName.INCH, 0.0);
        Assert.assertNotEquals(firstLength.unit, secondFeet.unit);
    }

    @Test
    public void givenPerformTestForEquality_ShouldValueCheck() throws QuantityMeasurementException {
        Length firstLength = new Length(UnitName.INCH, 5.0);
        Length secondLength = new Length(UnitName.INCH, 0.0);
        Assert.assertNotEquals(firstLength.value, secondLength.value);
    }

    @Test
    public void givenZeroInchAndZeroInch_ShouldReturnEqual()
            throws QuantityMeasurementException {
        Length firstInch = new Length(UnitName.INCH, 0.0);
        Length secondInch = new Length(UnitName.INCH, 0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheckForInch() {
        try {
            Length firstInch = new Length(UnitName.INCH, null);
            Length secondInch = new Length(UnitName.INCH, 0.0);
            Assert.assertEquals(firstInch, secondInch);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_ShouldReferenceCheckForInch()
            throws QuantityMeasurementException {
        Length firstInch = new Length(UnitName.INCH, 0.0);
        Length secondInch = new Length(UnitName.INCH, 0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_ShouldTypeCheckForInch()
            throws QuantityMeasurementException {
        Length firstInch = new Length(UnitName.INCH, 0.0);
        Length secondInch = new Length(UnitName.FEET, 0.0);
        Assert.assertNotEquals(firstInch.unit, secondInch.unit);
    }

    @Test
    public void givenPerformTestForEquality_ShouldValueCheckForInch()
            throws QuantityMeasurementException {
        Length firstInch = new Length(UnitName.INCH, 0.0);
        Length secondInch = new Length(UnitName.INCH, 5.0);
        Assert.assertNotEquals(firstInch.value, secondInch.value);
    }

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInYard()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 3.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.FEET,
                ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneFeet_ShouldNotReturnOneYard()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.FEET,
                ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneInch_ShouldNotReturnOneYard()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.INCH,
                ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_ShouldReturnThirtySixInch()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.YARD,
                ConversionType.YARD_TO_INCH, convertValue);
        Assert.assertEquals(36.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityThirtySixInch_ShouldReturnOneYard()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 36.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.INCH,
                ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_ShouldNotReturnThreeFeet()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.YARD,
                ConversionType.YARD_TO_FEET, convertValue);
        Assert.assertEquals(3.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityTwoInch_ShouldNotReturnFiveCentiMeter()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 2.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.INCH,
                ConversionType.INCH_TO_CM, convertValue);
        Assert.assertEquals(5.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityFiveCentiMeter_ShouldNotReturnTwoInch()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(UnitName.CM,
                ConversionType.CM_TO_INCH, convertValue);
        Assert.assertEquals(2.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityTwoInchAndTwoInch_WhenAdded_ShouldNotReturnFourInch()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Length firstInch = new Length(UnitName.INCH, 2.0);
        Length secondInch = new Length(UnitName.INCH, 2.0);
        double total = firstInch.value + secondInch.value;
        Assert.assertEquals(4.0, total, 0.0);
    }

    @Test
    public void givenQuantityOneFeetAndTwoInch_WhenAdded_ShouldNotReturnFourteenInch()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(UnitName.FEET,
                ConversionType.FEET_TO_INCH, convertValue);
        Length secondValue = new Length(UnitName.INCH, 2.0);
        double total = firstValue + secondValue.value;
        Assert.assertEquals(14.0, total, 0.0);
    }

    @Test
    public void givenQuantityOneFeetAndOneFeet_WhenAdded_ShouldNotReturnFourteenInch()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double firstConvertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(UnitName.FEET,
                ConversionType.FEET_TO_INCH, firstConvertValue);
        double secondConvertValue = 1.0;
        double secondValue = quantityMeasurement.unitConverter(UnitName.FEET,
                ConversionType.FEET_TO_INCH, secondConvertValue);
        double total = firstValue + secondValue;
        Assert.assertEquals(24.0, total, 0.0);
    }

    @Test
    public void givenQuantity2InchAnd2AndHalfCM_WhenAdded_ShouldNotReturnThreeInch()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Length firstValue = new Length(UnitName.INCH, 2.0);
        double secondConvertValue = 5d / 2d;
        double secondValue = quantityMeasurement.unitConverter(UnitName.CM,
                ConversionType.CM_TO_INCH, secondConvertValue);
        double total = quantityMeasurement.addition(firstValue.value, secondValue);
        Assert.assertEquals(3.0, total, 0.0);
    }

    @Test
    public void givenQuantityOneGallon_ShouldReturnThreePointSevenEightLitres()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double secondValue = quantityMeasurement.unitConverter(UnitName.GALLON,
                ConversionType.GALLON_TO_LITER, convertValue);
        Assert.assertEquals(3.78, secondValue, 0.0);
    }

    @Test
    public void givenQuantityOneLiter_ShouldReturnThousandML() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double secondValue = quantityMeasurement.unitConverter(UnitName.LITER,
                ConversionType.LITER_TO_ML, convertValue);
        Assert.assertEquals(1000.0, secondValue, 0.0);
    }

    @Test
    public void given1GallonAndThreePointSevenEightLitres_ShouldReturnSevenPointSevenFiveLitres()
            throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(UnitName.GALLON,
                ConversionType.GALLON_TO_LITER, convertValue);
        Volume secondValue = new Volume(UnitName.LITER,189d/50d);
        double total = quantityMeasurement.addition(firstValue, secondValue.value);
        Assert.assertEquals(7.56,total,0.0);
    }

    @Test
    public void given1KG_ShouldReturn1000Gram() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double convertValue = 1.0;
        double convertedValue = quantityMeasurement.unitConverter(UnitName.KG,
                ConversionType.GALLON_TO_LITER, convertValue);
    }
}
