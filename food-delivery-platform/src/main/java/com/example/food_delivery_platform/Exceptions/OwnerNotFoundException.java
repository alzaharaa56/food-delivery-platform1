package com.example.food_delivery_platform.Exceptions;

public class OwnerNotFoundException extends RuntimeException{
    public OwnerNotFoundException() {
        super("Owner not found");
    }
}