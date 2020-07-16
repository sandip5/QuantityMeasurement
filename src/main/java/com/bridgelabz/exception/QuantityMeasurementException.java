package com.bridgelabz.exception;

public class QuantityMeasurementException extends Throwable {
    public enum ExceptionType {
        NULL_POINTER_EXCEPTION,
        QUANTITY_TYPE_MISMATCH,
        NEGATIVE_VALUE
    }

    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
