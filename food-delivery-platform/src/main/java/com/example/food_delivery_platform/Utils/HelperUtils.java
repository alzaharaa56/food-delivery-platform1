package com.example.food_delivery_platform.Utils;


import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public class HelperUtils {


    public static String generateCode(String prefix) {
        return prefix + "-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }


    public static Double calculateTotal(Double subtotal, Double deliveryFee, Double discount) {
        if (subtotal == null) subtotal = 0.0;
        if (deliveryFee == null) deliveryFee = 0.0;
        if (discount == null) discount = 0.0;
        return subtotal + deliveryFee - discount;
    }


    public static String formatCurrency(Double amount) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(amount) + " OMR";
    }


    public static boolean isBusinessOpen(LocalTime openingTime, LocalTime closingTime) {
        LocalTime now = LocalTime.now();
        return (now.isAfter(openingTime) && now.isBefore(closingTime));
    }


    public static long hoursBetween(LocalDateTime start, LocalDateTime end) {
        return java.time.Duration.between(start, end).toHours();
    }
}
