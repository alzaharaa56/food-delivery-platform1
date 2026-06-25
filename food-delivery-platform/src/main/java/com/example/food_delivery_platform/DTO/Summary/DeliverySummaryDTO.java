package com.example.food_delivery_platform.DTO.Summary;



import lombok.Data;

@Data
public class DeliverySummaryDTO {
    private Integer totalDeliveries;
    private Integer activeDrivers;
    private Integer completedDeliveries;
    private Integer delayedDeliveries;
    private Integer cancelledDeliveries;


    public static DeliverySummaryDTO of(Integer total, Integer activeDrivers,
                                        Integer completed, Integer delayed, Integer cancelled) {
        DeliverySummaryDTO dto = new DeliverySummaryDTO();
        dto.setTotalDeliveries(total);
        dto.setActiveDrivers(activeDrivers);
        dto.setCompletedDeliveries(completed);
        dto.setDelayedDeliveries(delayed);
        dto.setCancelledDeliveries(cancelled);
        return dto;
    }
}


