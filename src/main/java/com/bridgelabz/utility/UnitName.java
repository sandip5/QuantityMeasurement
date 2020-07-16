package com.bridgelabz.utility;

public enum UnitName {
    INCH(QuantityType.LENGTH),CM(QuantityType.LENGTH),FEET(QuantityType.LENGTH),YARD(QuantityType.LENGTH),
    GALLON(QuantityType.VOLUME), LITER(QuantityType.VOLUME), KG(QuantityType.WEIGHT),
    TONE(QuantityType.WEIGHT), GRAM(QuantityType.WEIGHT);

    public QuantityType quantityType;

    UnitName(QuantityType quantityType) {
        this.quantityType = quantityType;
    }
}
