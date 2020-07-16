package com.bridgelabz.test;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.model.Quantity;
import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.utility.ConversionType;
import com.bridgelabz.utility.QuantityType;
import com.bridgelabz.utility.UnitName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = null;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInInches()
            throws QuantityMeasurementException {
        double value = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.FEET,
                ConversionType.FEET_TO_INCH, value);
        Assert.assertEquals(60.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_WhenCheckEquality_ShouldReturnEqual()
            throws QuantityMeasurementException {
        Quantity firstLength = new Quantity(UnitName.FEET, 0.0);
        Quantity secondLength = new Quantity(UnitName.FEET, 0.0);
        Assert.assertEquals(firstLength, secondLength);
    }

    @Test
    public void givenPerformTestForEquality_WhenCheckEquality_ShouldReturnNullValueForNullInput() {
        try {
            Quantity firstLength = new Quantity(UnitName.FEET, null);
            Quantity secondLength = new Quantity(UnitName.FEET, 0.0);
            Assert.assertEquals(firstLength, secondLength);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_WhenCheckEquality_ShouldReferenceEqualsAtTypeAndValueSame()
            throws QuantityMeasurementException {
        Quantity firstLength = new Quantity(UnitName.FEET, 0.0);
        Quantity secondLength = new Quantity(UnitName.FEET, 0.0);
        Assert.assertEquals(firstLength, secondLength);
    }

    @Test
    public void givenPerformTestForEquality_WhenCheckEquality_ShouldNotEqualAtValueSameButTypeDifferent()
            throws QuantityMeasurementException {
        Quantity firstLength = new Quantity(UnitName.FEET, 0.0);
        Quantity secondFeet = new Quantity(UnitName.INCH, 0.0);
        Assert.assertNotEquals(firstLength.unit, secondFeet.unit);
    }

    @Test
    public void givenPerformTestForEquality_WhenCheckEquality_ShouldNotEqualAtSameTypeAndDifferentValue()
            throws QuantityMeasurementException {
        Quantity firstLength = new Quantity(UnitName.INCH, 5.0);
        Quantity secondLength = new Quantity(UnitName.INCH, 0.0);
        Assert.assertNotEquals(firstLength.value, secondLength.value);
    }

    @Test
    public void givenZeroInchAndZeroInch_WhenCheckEquality_ShouldReturnEqualAtSameTypeAndValue()
            throws QuantityMeasurementException {
        Quantity firstInch = new Quantity(UnitName.INCH, 0.0);
        Quantity secondInch = new Quantity(UnitName.INCH, 0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_WhenCheckEquality_ShouldReturnNullForNullValue() {
        try {
            Quantity firstInch = new Quantity(UnitName.INCH, null);
            Quantity secondInch = new Quantity(UnitName.INCH, 0.0);
            Assert.assertEquals(firstInch, secondInch);
        } catch (QuantityMeasurementException e) {
            e.getMessage();
        }
    }

    @Test
    public void givenPerformTestForEquality_WhenReferenceCheck_ShouldReferenceEqualForSameTypeAndValue()
            throws QuantityMeasurementException {
        Quantity firstInch = new Quantity(UnitName.INCH, 0.0);
        Quantity secondInch = new Quantity(UnitName.INCH, 0.0);
        Assert.assertEquals(firstInch, secondInch);
    }

    @Test
    public void givenPerformTestForEquality_WhenTypeCheck_ShouldNotEqualForDifferentTypeUnit()
            throws QuantityMeasurementException {
        Quantity firstInch = new Quantity(UnitName.INCH, 0.0);
        Quantity secondInch = new Quantity(UnitName.FEET, 0.0);
        Assert.assertNotEquals(firstInch.unit, secondInch.unit);
    }

    @Test
    public void givenPerformTestForEquality_WhenValueCheck_ShouldNotEqualForTwoDifferentValue()
            throws QuantityMeasurementException {
        Quantity firstInch = new Quantity(UnitName.INCH, 0.0);
        Quantity secondInch = new Quantity(UnitName.INCH, 5.0);
        Assert.assertNotEquals(firstInch.value, secondInch.value);
    }

    @Test
    public void givenQuantityInFeet_WhenConvertedFeetToYard_ShouldReturnQuantityInYard()
            throws QuantityMeasurementException {
        double convertValue = 3.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.FEET,
                ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneFeet_WhenConvertedFeetToYard_ShouldNotReturnOneYard()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.FEET,
                ConversionType.FEET_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneInch_WhenConvertedInchToYard_ShouldNotReturnOneYard()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.INCH,
                ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertNotEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_WhenConvertedYardToInch_ShouldReturnThirtySixInch()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.YARD,
                ConversionType.YARD_TO_INCH, convertValue);
        Assert.assertEquals(36.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityThirtySixInch_WhenConvertedInchToYard_ShouldReturnOneYard()
            throws QuantityMeasurementException {
        double convertValue = 36.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.INCH,
                ConversionType.INCH_TO_YARD, convertValue);
        Assert.assertEquals(1.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityOneYard_WhenConvertedYardToFeet_ShouldNotReturnThreeFeet()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.YARD,
                ConversionType.YARD_TO_FEET, convertValue);
        Assert.assertEquals(3.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityTwoInch_WhenConvertedInchToCentimeter_ShouldNotReturnFiveCentiMeter()
            throws QuantityMeasurementException {
        double convertValue = 2.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.INCH,
                ConversionType.INCH_TO_CM, convertValue);
        Assert.assertEquals(5.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityFiveCentiMeter_WhenConvertedCMToInch_ShouldNotReturnTwoInch()
            throws QuantityMeasurementException {
        double convertValue = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.CM,
                ConversionType.CM_TO_INCH, convertValue);
        Assert.assertEquals(2.0, convertedQuantity, 0.0);
    }

    @Test
    public void givenQuantityTwoInchAndTwoInch_WhenAdded_ShouldNotReturnFourInch()
            throws QuantityMeasurementException {
        Quantity firstInch = new Quantity(UnitName.INCH, 2.0);
        Quantity secondInch = new Quantity(UnitName.INCH, 2.0);
        double total = firstInch.value + secondInch.value;
        Assert.assertEquals(4.0, total, 0.0);
    }

    @Test
    public void givenQuantityOneFeetAndTwoInch_WhenAdded_ShouldNotReturnFourteenInch()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.FEET,
                ConversionType.FEET_TO_INCH, convertValue);
        Quantity secondValue = new Quantity(UnitName.INCH, 2.0);
        double total = firstValue + secondValue.value;
        Assert.assertEquals(14.0, total, 0.0);
    }

    @Test
    public void givenQuantityOneFeetAndOneFeet_WhenAdded_ShouldNotReturnFourteenInch()
            throws QuantityMeasurementException {
        double firstConvertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.FEET,
                ConversionType.FEET_TO_INCH, firstConvertValue);
        double secondConvertValue = 1.0;
        double secondValue = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.FEET,
                ConversionType.FEET_TO_INCH, secondConvertValue);
        double total = firstValue + secondValue;
        Assert.assertEquals(24.0, total, 0.0);
    }

    @Test
    public void givenQuantity2InchAnd2AndHalfCM_WhenAdded_ShouldNotReturnThreeInch()
            throws QuantityMeasurementException {
        Quantity firstValue = new Quantity(UnitName.INCH, 2.0);
        double secondConvertValue = 5d / 2d;
        double secondValue = quantityMeasurement.unitConverter(QuantityType.LENGTH, UnitName.CM,
                ConversionType.CM_TO_INCH, secondConvertValue);
        double total = quantityMeasurement.addition(firstValue.value, secondValue);
        Assert.assertEquals(3.0, total, 0.0);
    }

    @Test
    public void givenQuantityOneGallon_WhenConvertedGallonToLiter_ShouldReturnThreePointSevenEightLitres()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double secondValue = quantityMeasurement.unitConverter(QuantityType.VOLUME, UnitName.GALLON,
                ConversionType.GALLON_TO_LITER, convertValue);
        Assert.assertEquals(3.78, secondValue, 0.0);
    }

    @Test
    public void givenQuantityOneLiter_WhenConvertedLiterToML_ShouldReturnThousandML()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double secondValue = quantityMeasurement.unitConverter(QuantityType.VOLUME, UnitName.LITER,
                ConversionType.LITER_TO_ML, convertValue);
        Assert.assertEquals(1000.0, secondValue, 0.0);
    }

    @Test
    public void given1GallonAndThreePointSevenEightLitres_WhenAdded_ShouldReturnSevenPointFiveSixLitres()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(QuantityType.VOLUME, UnitName.GALLON,
                ConversionType.GALLON_TO_LITER, convertValue);
        Quantity secondValue = new Quantity(UnitName.LITER, 189d / 50d);
        double total = quantityMeasurement.addition(firstValue, secondValue.value);
        Assert.assertEquals(7.56, total, 0.0);
    }

    @Test
    public void given1KG_WhenConvertedKGToGram_ShouldReturn1000Gram()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double convertedValue = quantityMeasurement.unitConverter(QuantityType.WEIGHT, UnitName.KG,
                ConversionType.KG_TO_GRAM, convertValue);
        Assert.assertEquals(1000.0, convertedValue, 0.0);
    }

    @Test
    public void given1Tone_WhenConvertedToneToKG_ShouldReturn1000KG()
            throws QuantityMeasurementException {
        double convertValue = 1.0;
        double convertedValue = quantityMeasurement.unitConverter(QuantityType.WEIGHT, UnitName.TONE,
                ConversionType.TONE_TO_KG, convertValue);
        Assert.assertEquals(1000.0, convertedValue, 0.0);
    }

    @Test
    public void given1ToneAnd1000Gram_WhenAdded_ShouldReturn1001KG()
            throws QuantityMeasurementException {
        double firstConvertValue = 1.0;
        double firstValue = quantityMeasurement.unitConverter(QuantityType.WEIGHT, UnitName.TONE,
                ConversionType.TONE_TO_KG, firstConvertValue);
        double secondConvertValue = 1000.0;
        double secondValue = quantityMeasurement.unitConverter(QuantityType.WEIGHT, UnitName.GRAM,
                ConversionType.GRAM_TO_KG, secondConvertValue);
        double total = quantityMeasurement.addition(firstValue, secondValue);
        Assert.assertEquals(1001.0, total, 0.);
    }

    @Test
    public void given212F_WhenConvertedFahrenheitToCelsius_ShouldReturn100C()
            throws QuantityMeasurementException {
        double convertValue = 212.0;
        double convertedValue = quantityMeasurement.unitConverter(QuantityType.TEMPERATURE, UnitName.FAHRENHEIT,
                ConversionType.FAHRENHEIT_TO_CELSIUS, convertValue);
        Assert.assertEquals(100.0, convertedValue, 0.0);
    }

    @Test
    public void given100C_WhenConvertedCelsiusToFahrenheit_ShouldReturn212F()
            throws QuantityMeasurementException {
        double convertValue = 100.0;
        double convertedValue = quantityMeasurement.unitConverter(QuantityType.TEMPERATURE, UnitName.CELSIUS,
                ConversionType.CELSIUS_TO_FAHRENHEIT, convertValue);
        Assert.assertEquals(212.0, convertedValue, 0.0);
    }

}
