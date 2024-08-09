package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeekResponse {

    @JsonProperty("meals")
    private List<Meal> meals;

    @JsonProperty("nutrients")
    private List<Nutrient> nutrients;

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Nutrient> getNutrients() {
        return nutrients;
    }

    public void setNutrients(List<Nutrient> nutrients) {
        this.nutrients = nutrients;
    }
}
