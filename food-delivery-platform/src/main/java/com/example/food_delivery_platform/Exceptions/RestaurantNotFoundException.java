package com.example.food_delivery_platform.Exceptions;

public class RestaurantNotFoundException extends RuntimeException{
    public RestaurantNotFoundException() {
        super("Restaurant not found");
    }

}
