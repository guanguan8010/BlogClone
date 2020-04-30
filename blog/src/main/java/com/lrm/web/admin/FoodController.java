package com.lrm.web.admin;


import com.lrm.po.Food;
import com.lrm.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    @GetMapping("/findAllFood")
    public Page<Food>findAllFood(@RequestParam(name = "page") Integer page, @RequestParam(name = "size") Integer size){

        PageRequest request = PageRequest.of(page,size);

        System.out.print(foodService.findAllFood(request).getContent());

        return foodService.findAllFood(request);

    }

    @GetMapping("/findAllFoodNoPage")
    public List<Food> findAllFoodNoPage(){

        return foodService.findAllFoodNoPage();

    }


}
