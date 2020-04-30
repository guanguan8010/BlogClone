package com.lrm.service;


import com.lrm.dao.ExerciseRepository;
import com.lrm.po.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService{

    @Autowired
    ExerciseRepository exerciseRepository;

    @Override
    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public List<Exercise> findAllExercise() {
        return exerciseRepository.findAll();
    }
}
