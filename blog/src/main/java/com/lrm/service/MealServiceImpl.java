package com.lrm.service;

import com.lrm.dao.MealRepository;
import com.lrm.po.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImpl implements MealService {


    @Autowired
    MealRepository mealRepository;

    @Override
    public List<Meal> findAllMeal() {
        return mealRepository.findAll();
    }

    @Override
    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    @Override
    public Meal findMealById(Integer userid) {

        Integer mealid = mealRepository.getMealIdByUserId(userid);

        return mealRepository.findById(mealid).get();
    }

    @Override
    public void saveMealIdByUserId(Integer userid, Integer mealid) {
        mealRepository.updateUserExercise(userid,mealid);
    }
}
