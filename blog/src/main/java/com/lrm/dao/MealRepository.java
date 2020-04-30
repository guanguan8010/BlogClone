package com.lrm.dao;

import com.lrm.po.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface MealRepository extends JpaRepository<Meal,Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE t_user_meal t SET t.mealid=?2  WHERE t.userid =?1",nativeQuery = true)
    Integer updateUserExercise(Integer userid,Integer mealid);

    @Query(value = "SELECT mealid FROM t_user_meal t WHERE t.userid=?1",nativeQuery = true)
    Integer getMealIdByUserId(Integer userid);
}
