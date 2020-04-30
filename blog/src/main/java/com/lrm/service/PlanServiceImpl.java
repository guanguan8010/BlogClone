package com.lrm.service;

import com.lrm.dao.PlanRepository;
import com.lrm.po.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    PlanRepository planRepository;

    @Override
    public Plan getPlan(Integer userid) {

        Integer planid = planRepository.getPlanIdByUserId(userid);

        return planRepository.findById(planid).get();
    }

    @Override
    public Plan savePlan(Plan plan, Integer planid,Integer userid) {

        planRepository.updateUserExercise(userid,planid);

        return planRepository.save(plan);
    }

    @Override
    public void savePlanRecom(Integer userid,Integer planid) {

        planRepository.updateUserExercise(userid,planid);
    }


    @Override
    public List<Plan> getAllPlan() {
        return planRepository.findAll();
    }

    @Transactional
    @Override
    public Integer updataPlanById(String planList,Integer id) {
        return planRepository.modifyPlanById(planList,id);
    }


}
