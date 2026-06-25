package com.example.food_delivery_platform.DTO.Request;
import com.example.food_delivery_platform.Entities.Customer;
import com.example.food_delivery_platform.Entities.RestaurantOwner;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantOwnerRequestDTO extends PersonDTO {
    @NotBlank
    private String businessLicenseCode;

    public static RestaurantOwner toEntity(RestaurantOwnerRequestDTO dto) {
        RestaurantOwner restaurantOwner = new RestaurantOwner();
        restaurantOwner.setFirstName(dto.getFirstName());
        restaurantOwner.setLastName(dto.getLastName());
        restaurantOwner.setEmail(dto.getEmail());
        restaurantOwner.setPhone(dto.getPhone());
        restaurantOwner.setPasswordHash(dto.getPassword());
        restaurantOwner.setBusinessLicenseCode(dto.getBusinessLicenseCode());
        return restaurantOwner;
    }

}


