package com.example.food_delivery_platform.Exceptions;

public class InvalidLoyaltyPointsException extends RuntimeException{
    public InvalidLoyaltyPointsException(String message) {
        super(message);
    }
}