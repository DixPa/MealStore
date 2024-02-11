package com.dixonpa.mealstore.dishes.business.facade;

import com.dixonpa.mealstore.dishes.domain.dto.DishDTO;
import com.dixonpa.mealstore.dishes.domain.dto.request.DishRequest;

import java.util.List;

public interface DishFacade {

    DishDTO createDish(DishRequest request);
    DishDTO updateDish(DishRequest request,Long id);
    DishDTO getById(Long id);
    List<DishDTO> getAll();
    void deleteById(Long id);
}
