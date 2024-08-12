package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DayResponse {

    @JsonProperty("meals")
    private List<Meal> meals;

    @JsonProperty("nutrients")
    private Nutrient nutrient;

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

}
