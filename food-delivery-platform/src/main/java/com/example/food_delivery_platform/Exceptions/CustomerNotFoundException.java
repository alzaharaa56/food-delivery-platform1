package com.example.food_delivery_platform.Exceptions;


import javax.swing.*;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException() {
        super("Customer not found");
    }
}
