package com.lrm.service;

import com.lrm.dao.FoodRepository;
import com.lrm.po.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodRepository foodRepository;

    @Transactional
    @Override
    public Page<Food> findAllFood(PageRequest request) {
        return foodRepository.findAll(request);
    }

    @Override
    public List<Food> findAllFoodNoPage() {
        return foodRepository.findAll();
    }
}
