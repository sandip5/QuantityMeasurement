package com.bridgelabz.test;

import com.bridgelabz.service.Feet;
import com.bridgelabz.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;


public class QuantityMeasurementTest {

    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInInches() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double numberInFeet = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(numberInFeet);
        Assert.assertEquals(60.0,convertedQuantity,0.0);
    }

    @Test
    public void givenZeroFeetAndZeroFeet_ShouldReturnEqual() {
        Feet firstFeet = new Feet(0.0);
        Feet secondFeet = new Feet(0.0);
        Assert.assertEquals(firstFeet,secondFeet);
    }

    @Test
    public void givenPerformTestForEquality_ShouldNullCheck() {
        Feet firstFeet = new Feet(null);
        Feet secondFeet = new Feet(0.0);
        Assert.assertEquals(firstFeet,secondFeet);
    }
}
