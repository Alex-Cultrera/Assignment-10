package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeekResponse {

    @JsonProperty("meals")
    private List<List<Meal>> meals;

    @JsonProperty("nutrients")
    private List<Nutrients> nutrients;

    public List<List<Meal>> getMeals() {
        return meals;
    }

    public void setMeals(List<List<Meal>> meals) {
        this.meals = meals;
    }

    public List<Nutrients> getNutrients() {
        return nutrients;
    }

    public void setNutrients(List<Nutrients> nutrients) {
        this.nutrients = nutrients;
    }
}
