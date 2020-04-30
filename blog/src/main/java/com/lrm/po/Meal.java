package com.lrm.po;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_meal")
public class Meal {

    @Id
    @GeneratedValue
    private Integer id;
    private String mealname;
    private String mealimg;
    private String breakfast;
    private String morningtea;
    private String lunch;
    private String afternoontea;
    private String dinner;
    private String aftertrain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public String getMealimg() {
        return mealimg;
    }

    public void setMealimg(String mealimg) {
        this.mealimg = mealimg;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getMorningtea() {
        return morningtea;
    }

    public void setMorningtea(String morningtea) {
        this.morningtea = morningtea;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getAfternoontea() {
        return afternoontea;
    }

    public void setAfternoontea(String afternoontea) {
        this.afternoontea = afternoontea;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getAftertrain() {
        return aftertrain;
    }

    public void setAftertrain(String aftertrain) {
        this.aftertrain = aftertrain;
    }
}
