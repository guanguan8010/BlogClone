package com.lrm.service;

import com.lrm.po.Meal;

import java.util.List;

public interface MealService {

    List<Meal> findAllMeal();

    Meal saveMeal(Meal meal);

    Meal findMealById(Integer userid);

    void saveMealIdByUserId(Integer userid,Integer mealid);
}
