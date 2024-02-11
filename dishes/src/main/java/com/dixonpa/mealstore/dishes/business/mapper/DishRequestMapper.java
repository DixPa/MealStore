package com.dixonpa.mealstore.dishes.business.mapper;

import com.dixonpa.mealstore.dishes.domain.dto.request.DishRequest;
import com.dixonpa.mealstore.dishes.domain.entity.Dish;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DishRequestMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "currency", target = "currency")
    Dish toDomain(DishRequest request);
}
