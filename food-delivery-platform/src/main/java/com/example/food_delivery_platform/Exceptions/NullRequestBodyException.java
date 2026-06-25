package com.example.food_delivery_platform.Exceptions;

public class NullRequestBodyException extends RuntimeException {
    public NullRequestBodyException(String message) {
        super(message);
    }
}
