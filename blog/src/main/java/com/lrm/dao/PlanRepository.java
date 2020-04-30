package com.lrm.dao;

import com.lrm.po.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface PlanRepository extends JpaRepository<Plan,Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE t_plan SET t_plan.plan=?1  WHERE t_plan.id =?2",nativeQuery = true)
    Integer modifyPlanById(String planList,Integer id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE t_user_exercise t SET t.exerciseid=?2  WHERE t.userid =?1",nativeQuery = true)
    Integer updateUserExercise(Integer userid,Integer exerciseid);

    @Query(value = "SELECT exerciseid FROM t_user_exercise t WHERE t.userid=?1",nativeQuery = true)
     Integer getPlanIdByUserId(Integer userid);

}
