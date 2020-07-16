package com.bridgelabz.utility;

public enum ConversionType {
    FEET_TO_INCH(12.0), INCH_TO_YARD(1d / 36d), YARD_TO_FEET(3),
    YARD_TO_INCH(36), FEET_TO_YARD(1d / 3d), INCH_TO_CM(5d / 2d),
    CM_TO_INCH(2d / 5d), GALLON_TO_LITER(189d/50d), LITER_TO_ML(1000.0),
    KG_TO_GRAM(1000.0),TONE_TO_KG(1000.0),GRAM_TO_KG(1d/1000d),
    FAHRENHEIT_TO_CELSIUS(0.0), CELSIUS_TO_FAHRENHEIT(0.0);
    public double conversionFactor;

    ConversionType(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
