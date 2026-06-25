package com.example.food_delivery_platform.DTO.Summary;


import lombok.Data;

@Data
public class CorporateOrderSummaryDTO {
    private Integer totalCorporateOrders;
    private Integer pendingCorporateOrders;
    private Integer completedCorporateOrders;
    private Integer cancelledCorporateOrders;
    private Double totalCorporateRevenue;
    private Integer uniqueCompanies;


    public static CorporateOrderSummaryDTO of(Integer total, Integer pending,
                                              Integer completed, Integer cancelled,
                                              Double revenue, Integer companies) {
        CorporateOrderSummaryDTO dto = new CorporateOrderSummaryDTO();
        dto.setTotalCorporateOrders(total);
        dto.setPendingCorporateOrders(pending);
        dto.setCompletedCorporateOrders(completed);
        dto.setCancelledCorporateOrders(cancelled);
        dto.setTotalCorporateRevenue(revenue);
        dto.setUniqueCompanies(companies);
        return dto;
    }
}

