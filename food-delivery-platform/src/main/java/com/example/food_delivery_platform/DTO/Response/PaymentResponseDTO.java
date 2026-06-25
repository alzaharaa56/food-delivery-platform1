package com.example.food_delivery_platform.DTO.Response;
import com.example.food_delivery_platform.Entities.Payment;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaymentResponseDTO {
    private String paymentMethod;
    private String status;
    private Double amount;

    public static PaymentResponseDTO toResponse(Payment payment) {

        PaymentResponseDTO dto = new PaymentResponseDTO();

        dto.setPaymentMethod(payment.getPaymentMethod());
        dto.setStatus(payment.getStatus());
        dto.setAmount(payment.getAmount());

        return dto;
    }

    public static List<PaymentResponseDTO> toResponse(List<Payment> payments) {
        List<PaymentResponseDTO> dtos = new ArrayList<>();

        for (Payment payment : payments) {
            dtos.add(toResponse(payment));
        }

        return dtos;
    }
}