package com.lrm.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_exercise")
public class Exercise {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer exercisetype;
    private Integer calorie;
    private String exercisename;
    private String exerciseimg;

    public Exercise(){

    }

    public Integer getCalorie() {
        return calorie;
    }

    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExercisetype() {
        return exercisetype;
    }

    public void setExercisetype(Integer exercisetype) {
        this.exercisetype = exercisetype;
    }

    public String getExercisename() {
        return exercisename;
    }

    public void setExercisename(String exercisename) {
        this.exercisename = exercisename;
    }

    public String getExerciseimg() {
        return exerciseimg;
    }

    public void setExerciseimg(String exerciseimg) {
        this.exerciseimg = exerciseimg;
    }
}

