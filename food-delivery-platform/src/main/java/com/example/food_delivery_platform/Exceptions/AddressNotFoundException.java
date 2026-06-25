package com.example.food_delivery_platform.Exceptions;

public class AddressNotFoundException extends RuntimeException{
    public AddressNotFoundException() {
        super("Address not found");
    }
}
