package com.bridgelabz.exception;

public class QuantityMeasurementException extends Throwable {
    public enum ExceptionType {
        NULL_POINTER_EXCEPTION("Null Value Provided Please Check Again");

        private final String message;

        ExceptionType(String message) {
            this.message = message;
        }
    }

    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
    }
}
