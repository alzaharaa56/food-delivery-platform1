package com.example.food_delivery_platform.DTO.Request;

import com.example.food_delivery_platform.Entities.Review;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequestDTO {
    @NotNull
    @Max(value = 5)
    @Min(value = 5)
    private Integer rating;
    private String comment;

    public static Review toEntity(ReviewRequestDTO dto) {
        Review review = new Review();

        review.setRating(dto.getRating());
        review.setComment(dto.getComment());

        return review;
    }

}

