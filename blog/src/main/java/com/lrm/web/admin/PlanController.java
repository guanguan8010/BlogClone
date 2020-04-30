package com.lrm.web.admin;

import com.lrm.po.Plan;
import com.lrm.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plan")
public class PlanController {

    @Autowired
    PlanService planService;

    @GetMapping("/getPlanById/{globalUserId}")
    public Plan getPlanById(@PathVariable("globalUserId") Integer userid){
        System.out.println(userid);
        return planService.getPlan(userid);
    }

    @PostMapping("/savePlan/{globalUserId}")
    public Plan savePlan(@RequestBody Plan plan,@PathVariable("globalUserId") Integer userid){

        System.out.println(plan.toString());
        return planService.savePlan(plan,plan.getId(),userid);
    }
    @PostMapping("/savePlanRecom/{globalUserId}")
    public String savePlanRecom(@RequestBody Plan plan,@PathVariable("globalUserId") Integer userid){

        System.out.println(userid);
        System.out.println(plan.getId());
         planService.savePlanRecom(userid,plan.getId());
         return "success";
    }

    @GetMapping("/getAllPlan")
    public List<Plan> getAllPlan() {
        return planService.getAllPlan();
    }

    @PostMapping("/updataPlanById")
    public void updataPlanById(@RequestParam(name = "planList") String planList){
        System.out.println(planList);
        planService.updataPlanById(planList,1);
    }
}
