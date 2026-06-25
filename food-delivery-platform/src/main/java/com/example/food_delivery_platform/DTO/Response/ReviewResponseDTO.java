package com.example.food_delivery_platform.DTO.Response;

import com.example.food_delivery_platform.Entities.Review;
import lombok.Data;
import org.springframework.boot.convert.DataSizeUnit;

import java.util.ArrayList;
import java.util.List;

@Data
public class ReviewResponseDTO {

    private Integer rating;
    private String comment;

    public static ReviewResponseDTO toResponse(Review review) {

        ReviewResponseDTO dto = new ReviewResponseDTO();
        dto.setRating(review.getRating());
        dto.setComment(review.getComment());
        return dto;
    }

    public static List<ReviewResponseDTO> toResponse(List<Review> reviews) {
        List<ReviewResponseDTO> dtos = new ArrayList<>();

        for (Review review : reviews) {
            dtos.add(toResponse(review));
        }

        return dtos;
    }

}


