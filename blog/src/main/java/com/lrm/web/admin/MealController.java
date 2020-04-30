package com.lrm.web.admin;


import com.lrm.po.Meal;
import com.lrm.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meal")
public class MealController {

    @Autowired
    MealService mealService;

    @GetMapping("/findAllMeal")
    public List<Meal> findAllMeal(){
        return mealService.findAllMeal();
    }

    @GetMapping("/findMealById/{globalUserId}")
    public Meal findMealById(@PathVariable("globalUserId") Integer userid){
        return mealService.findMealById(userid);

    }


    @PostMapping("/saveMealPlan/{globalUserId}")
    public String saveMealPlan(@RequestParam(name = "mealid") Integer mealid,
                             @PathVariable("globalUserId") Integer userid){

//        Meal meal = new Meal();
//        meal.setId(1);
//        meal.setMealname(mealname);
//        meal.setMealimg(mealimg);
//        meal.setBreakfast(breakfast);
//        meal.setMorningtea(morningtea);
//        meal.setLunch(lunch);
//        meal.setAfternoontea(afternoontea);
//        meal.setDinner(dinner);
//        meal.setAftertrain(aftertrain);
//        return mealService.saveMeal(meal);
        mealService.saveMealIdByUserId(userid,mealid);
        return "success";
    }

}
