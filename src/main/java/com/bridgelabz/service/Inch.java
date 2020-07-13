package com.bridgelabz.service;

public class Inch {
    private double valueInInch;

    public Inch(double valueInInch) {
        this.valueInInch = valueInInch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.valueInInch, valueInInch) == 0;
    }

}
