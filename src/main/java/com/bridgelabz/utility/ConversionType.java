package com.bridgelabz.utility;

public enum ConversionType {
    FEET_TO_INCH(12.0),INCH_TO_YARD(1d/36d),YARD_TO_FEET(3),
    YARD_TO_INCH(36),FEET_TO_YARD(1d/3d),INCH_TO_CM(5d/2d);
    public double conversionFactor;

    ConversionType(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
