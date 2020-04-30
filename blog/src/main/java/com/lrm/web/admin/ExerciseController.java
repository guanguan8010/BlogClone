package com.lrm.web.admin;


import com.lrm.po.Exercise;
import com.lrm.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/findAllExercise")
    public List<Exercise> findAllExercise(){
        List<Exercise> exerciseList = exerciseService.findAllExercise();
        System.out.println(exerciseList);
        return exerciseList;
    }

//    @GetMapping("/toCountExpend")
//    public Integer toCountExpend(@RequestParam("planList") String planList){
//        System.out.println(planList);
//
//        return 0;
//
//    }

}
