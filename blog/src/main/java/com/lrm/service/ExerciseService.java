package com.lrm.service;

import com.lrm.po.Exercise;

import java.util.List;

public interface ExerciseService {

    Exercise saveExercise(Exercise exercise);

    List<Exercise> findAllExercise();

}
