package com.bridgelabz.enums;

public enum UnitName {
    INCH(QuantityType.LENGTH),
    CM(QuantityType.LENGTH),
    FEET(QuantityType.LENGTH),
    YARD(QuantityType.LENGTH),
    GALLON(QuantityType.VOLUME),
    LITER(QuantityType.VOLUME),
    KG(QuantityType.WEIGHT),
    TONE(QuantityType.WEIGHT),
    GRAM(QuantityType.WEIGHT),
    FAHRENHEIT(QuantityType.TEMPERATURE),
    CELSIUS(QuantityType.TEMPERATURE);

    public QuantityType quantityType;

    UnitName(QuantityType quantityType) {
        this.quantityType = quantityType;
    }
}
