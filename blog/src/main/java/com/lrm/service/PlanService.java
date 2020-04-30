package com.lrm.service;


import com.lrm.po.Plan;

import java.util.List;

public interface PlanService {

    Plan getPlan(Integer userid);

    Plan savePlan(Plan plan,Integer planid,Integer userid);

    void savePlanRecom(Integer userid,Integer planid);

    List<Plan> getAllPlan();

    Integer updataPlanById(String planList,Integer id);
}
