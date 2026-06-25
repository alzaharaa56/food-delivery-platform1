package com.example.food_delivery_platform.DTO.Request;
import com.example.food_delivery_platform.Entities.Payment;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDTO {
    @NotBlank(message = "Payment method is required")
    private String paymentMethod;

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.0")
    private Double amount;

    public static Payment toEntity(PaymentRequestDTO dto) {
        Payment payment = new Payment();

        payment.setPaymentMethod(dto.getPaymentMethod());
        payment.setAmount(dto.getAmount());

        return payment;
    }


}


