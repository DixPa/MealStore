package com.dixonpa.mealstore.dishes.business.services.impl;

import com.dixonpa.mealstore.dishes.business.services.DishService;
import com.dixonpa.mealstore.dishes.domain.entity.Dish;
import com.dixonpa.mealstore.dishes.persintence.DishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {

    private final DishRepository dishRepository;
    @Override
    public Dish createDish(Dish dish) {
        return dishRepository.save(dish);
    }

    @Override
    public Dish updateDish(Dish dish) {

        return dishRepository.save(dish);
    }

    @Override
    public Dish getById(Long id) {
        return dishRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Dish> getAll() {
        return dishRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        dishRepository.deleteById(id);
    }
}
