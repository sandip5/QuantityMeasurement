package com.bridgelabz.enums;

public enum ConversionType {
    FEET_TO_INCH(12.0, QuantityType.LENGTH),
    INCH_TO_YARD(1d / 36d, QuantityType.LENGTH),
    YARD_TO_FEET(3, QuantityType.LENGTH),
    YARD_TO_INCH(36, QuantityType.LENGTH),
    FEET_TO_YARD(1d / 3d, QuantityType.LENGTH),
    INCH_TO_CM(5d / 2d, QuantityType.LENGTH),
    CM_TO_INCH(2d / 5d, QuantityType.LENGTH),
    GALLON_TO_LITER(189d / 50d, QuantityType.VOLUME),
    LITER_TO_ML(1000.0, QuantityType.VOLUME),
    KG_TO_GRAM(1000.0, QuantityType.WEIGHT),
    TONE_TO_KG(1000.0, QuantityType.WEIGHT),
    GRAM_TO_KG(1d / 1000d, QuantityType.WEIGHT),
    FAHRENHEIT_TO_CELSIUS(5d / 9d, 32, QuantityType.TEMPERATURE),
    CELSIUS_TO_FAHRENHEIT(9d / 5d, 32, QuantityType.TEMPERATURE);

    public int constantFactor;
    public double conversionFactor;

    ConversionType(double conversionFactor, QuantityType length) {
        this.conversionFactor = conversionFactor;
    }

    ConversionType(double conversionFactor, int constantFactor, QuantityType temperature) {
        this.conversionFactor = conversionFactor;
        this.constantFactor = constantFactor;
    }
}
