package com.bridgelabz.service;

public enum ConversionType {
    FEET_TO_YARD(1/3);

    private double conversionFactor;

    ConversionType(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
