package com.dixonpa.mealstore.dishes.business.facade.impl;

import com.dixonpa.mealstore.dishes.business.facade.DishFacade;
import com.dixonpa.mealstore.dishes.business.mapper.DishDtoMapper;
import com.dixonpa.mealstore.dishes.business.mapper.DishRequestMapper;
import com.dixonpa.mealstore.dishes.business.services.DishService;
import com.dixonpa.mealstore.dishes.business.services.DishSetValuesToUpdateService;
import com.dixonpa.mealstore.dishes.domain.dto.DishDTO;
import com.dixonpa.mealstore.dishes.domain.dto.request.DishRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DishFacadeImpl implements DishFacade {

    private final DishRequestMapper dishRequestMapper;
    private final DishDtoMapper dishDtoMapper;
    private final DishService dishService;
    private final DishSetValuesToUpdateService setValuesToUpdateService;
    @Override
    public DishDTO createDish(DishRequest request) {
        var dishRequest =dishRequestMapper.toDomain(request);
        var dishCreated = dishService.createDish(dishRequest);
        return dishDtoMapper.toDto(dishCreated);
    }

    @Override
    public DishDTO updateDish(DishRequest request, Long id) {

        var dishToUpdate = dishService.getById(id);

        setValuesToUpdateService.execute(request, dishToUpdate);
        dishService.updateDish(dishToUpdate);

        return dishDtoMapper.toDto(dishToUpdate);
    }

    @Override
    public DishDTO getById(Long id) {
        var getDishByID = dishService.getById(id);
        return dishDtoMapper.toDto(getDishByID);
    }

    @Override
    public List<DishDTO> getAll() {

        var dishes = dishService.getAll();
        return dishes.stream()
                .map(dishDtoMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        // u need to have 'logic business'
        dishService.deleteById(id);

    }
}
