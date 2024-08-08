package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {

    @JsonProperty("calories")
    private Double calories;
    @JsonProperty("carbohydrates")
    private Double carbohydrates;
    @JsonProperty("fat")
    private Double fat;
    @JsonProperty("protein")
    private Double protein;

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }
}
