package com.dixonpa.mealstore.dishes.business.services;

import com.dixonpa.mealstore.dishes.domain.dto.request.DishRequest;
import com.dixonpa.mealstore.dishes.domain.entity.Dish;
import org.springframework.stereotype.Service;

@Service
public class DishSetValuesToUpdateService {

    public void execute (DishRequest request, Dish currentDish){
        currentDish.setName(request.getName());
        currentDish.setPrice(request.getPrice());
        currentDish.setCurrency(request.getCurrency());
    }
}
