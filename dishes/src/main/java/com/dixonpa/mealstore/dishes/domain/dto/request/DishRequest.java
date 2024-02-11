package com.dixonpa.mealstore.dishes.domain.dto.request;

import lombok.Data;

@Data
public class DishRequest {
    private String name;
    private Double price;
    private String currency;
}
