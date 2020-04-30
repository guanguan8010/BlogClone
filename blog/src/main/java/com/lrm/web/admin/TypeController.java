package com.lrm.web.admin;

import com.lrm.po.Type;
import com.lrm.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Type> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        System.out.println(page);
        System.out.println(size);
        System.out.print(typeService.listType(request).getContent());
        System.out.println("--------------------------");
        return typeService.listType(request);
    }
    @GetMapping("/findTest")
    public String findTest(){

        return "i'm here";
    }

    @GetMapping("/input")
    public String input(Model model) {
        model.addAttribute("type", new Type());
        return "admin/type-input";
    }

    @PostMapping("/saveType")
    public String save(@RequestBody Type type){
        Type result = typeService.saveType(type);
        if(result != null){
            return "success";
        }else{
            return "fail";
        }
    }

    @GetMapping("/findByTypeId/{id}")
    public Type findById(@PathVariable("id") Integer id){
        return  typeService.getType((long)id);
    }

    @PostMapping("/updateType")
    public String update(@RequestBody Type type){
        Type result = typeService.saveType(type);
        if(result != null){
            return "success";
        }else{
            return "fail";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        typeService.deleteType((long)id);
    }


}
