package com.example.food_delivery_platform.Exceptions;


public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String resourceName, Long id) {
        super(resourceName + " not found with id: " + id);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}