package com.lrm.service;

import com.lrm.po.Blog;
import com.lrm.po.Exercise;
import com.lrm.po.Plan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogServiceImplTest {


    @Autowired
    BlogService blogService;

    @Autowired
    ExerciseService exerciseService;

    @Autowired
    PlanService planService;

    @Autowired
    FoodService foodService;

    @Autowired
    ReviewService reviewService;

    @Autowired
    UserService userService;

    @Test
    public void test(){

        Exercise exercise = new Exercise();
        exercise.setExercisetype(1);
        exercise.setCalorie(500);
        exercise.setExerciseimg("img");
        exercise.setExercisename("卧推(10kg*每组10次*4)");
        System.out.println(exerciseService.saveExercise(exercise));
    }


    @Test
    public void test2(){
//        Plan plan = new Plan();
//        plan.setPlan("1,2,3");
//        plan.setId(1);
//        System.out.println(planService.savePlan(plan));
//        planService.getPlan(2);
        System.out.println( planService.updataPlanById("3,4,19,20,21,22,23",1));

    }


    @Test
    public void searchBlog(){
        System.out.println("------------------------------");
        String title = "";
        PageRequest request = PageRequest.of(0,5);
//        System.out.println(blogService.findAllBlog(request).getContent());
        System.out.println(blogService.listBlog(request,title).getContent());
    }

    @Test
    public void findAllFoodTest(){
        System.out.println("------------------------------");
        PageRequest request = PageRequest.of(0,5);
        System.out.println(foodService.findAllFood(request).getContent());
    }

    @Test
    public void findReview(){
        System.out.println("----------------");
        System.out.println(reviewService.findReviewByBlogId(22));

    }
    @Test
    public void findLogin(){
        System.out.println("----------------");
        System.out.println(userService.checkUser("guanguan","123456"));

    }



}