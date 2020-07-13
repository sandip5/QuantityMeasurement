package com.bridgelabz.exception;

public class QuantityMeasurementException extends Throwable{
    public enum ExceptionType {
        NULL_POINTER_EXCEPTION("Null Value Provided Please Check Again");

        public String message;

        ExceptionType(String message) {
            this.message = message;
        }
    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type) {
//        super(message);
        this.type = type;
    }
}
