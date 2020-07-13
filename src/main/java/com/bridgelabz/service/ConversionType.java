package com.bridgelabz.service;

public enum ConversionType {
    FEET_TO_YARD(0.3333333333333333);

    public double conversionFactor;

    ConversionType(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
