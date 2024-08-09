package com.coderscampus.assignment10.web;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.MealPlan;
import com.coderscampus.assignment10.dto.WeekResponse;
import com.coderscampus.assignment10.service.MealPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Random;

@RestController
public class MealPlanController {

    private final MealPlanService mealPlanService;

    @Autowired
    private MealPlanController(MealPlanService mealPlanService){
        this.mealPlanService = mealPlanService;
    }

    @GetMapping("")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
        MealPlan mealPlan = new MealPlan();
        if (numCalories != null && !numCalories.isEmpty()) {
            mealPlan.setTargetCalories(BigDecimal.valueOf(Double.parseDouble(numCalories)));
        } else {
            Random random = new Random();
            numCalories = String.valueOf(random.nextInt(1, 4000));
            mealPlan.setTargetCalories(BigDecimal.valueOf(Double.parseDouble(numCalories)));
        }
        mealPlan.setDiet(diet != null ? diet : "gluten free");
        mealPlan.setExclude(exclusions != null ? exclusions : "dairy");
        WeekResponse weekMealPlanner = mealPlanService.fetchWeekMealPlanFromSpoonacularAPI(mealPlan.getTargetCalories(), mealPlan.getDiet(), mealPlan.getExclude());
        return ResponseEntity.ok(weekMealPlanner);
    }


    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
        MealPlan mealPlan = new MealPlan();
        if (numCalories != null && !numCalories.isEmpty()) {
            mealPlan.setTargetCalories(BigDecimal.valueOf(Double.parseDouble(numCalories)));
        } else {
            Random random = new Random();
            numCalories = String.valueOf(random.nextInt(1, 4000));
            mealPlan.setTargetCalories(BigDecimal.valueOf(Double.parseDouble(numCalories)));
        }
        mealPlan.setDiet(diet != null ? diet : "gluten free");
        mealPlan.setExclude(exclusions != null ? exclusions : "dairy");
        DayResponse oneDayMealPlanner = mealPlanService.getOneDayMealPlanFromSpoonacularAPI(mealPlan.getTargetCalories(), mealPlan.getDiet(), mealPlan.getExclude());
        return ResponseEntity.ok(oneDayMealPlanner);
    }


}
