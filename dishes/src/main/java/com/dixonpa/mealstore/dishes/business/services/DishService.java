package com.dixonpa.mealstore.dishes.business.services;

import com.dixonpa.mealstore.dishes.domain.entity.Dish;

import java.util.List;

public interface DishService {

    Dish createDish(Dish dish);
    Dish updateDish(Dish dish);
    Dish getById(Long id);
    List<Dish> getAll();
    void deleteById(Long id);
}
