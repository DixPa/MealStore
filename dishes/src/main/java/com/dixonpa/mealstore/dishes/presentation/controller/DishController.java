package com.dixonpa.mealstore.dishes.presentation.controller;

import com.dixonpa.mealstore.dishes.business.facade.impl.DishFacadeImpl;
import com.dixonpa.mealstore.dishes.domain.dto.DishDTO;
import com.dixonpa.mealstore.dishes.domain.dto.request.DishRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dish")
public class DishController {

    private final DishFacadeImpl dishFacade;

    @PostMapping()
    public DishDTO create(@RequestBody DishRequest dishRequest){
        return dishFacade.createDish(dishRequest);
    }

    @PutMapping("/{id}")
    public DishDTO update (@RequestBody DishRequest dishRequest, @PathVariable Long id){
        return dishFacade.updateDish(dishRequest, id);
    }
    @GetMapping
    public List<DishDTO> getAll(){
        return dishFacade.getAll();
    }
}
