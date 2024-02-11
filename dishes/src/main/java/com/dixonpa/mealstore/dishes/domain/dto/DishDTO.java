package com.dixonpa.mealstore.dishes.domain.dto;

import lombok.Data;

@Data
public class DishDTO {
    private Long id;
    private String name;
    private Double price;
    private String currency;
}
