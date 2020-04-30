package com.lrm.service;

import com.lrm.po.Food;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface FoodService {

    Page<Food> findAllFood(PageRequest request);

    List<Food> findAllFoodNoPage();

}
