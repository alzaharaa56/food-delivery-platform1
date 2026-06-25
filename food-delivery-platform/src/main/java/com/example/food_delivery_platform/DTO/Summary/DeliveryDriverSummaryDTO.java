package com.example.food_delivery_platform.DTO.Summary;


import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.DeliveryDriver;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeliveryDriverSummaryDTO {
    private String fullName;
    private String Vehicle;

    public static DeliveryDriverSummaryDTO toSummary(DeliveryDriver deliveryDriver) {
        DeliveryDriverSummaryDTO dto = new DeliveryDriverSummaryDTO();
        dto.setFullName(deliveryDriver.getFirstName()
                + " "
                + deliveryDriver.getLastName()
        );
        dto.setVehicle("Vehicle type : " +deliveryDriver.getVehicleType()
                + " Plate Number"
                + deliveryDriver.getVehiclePlate()
        );
        return dto;
    }
}

