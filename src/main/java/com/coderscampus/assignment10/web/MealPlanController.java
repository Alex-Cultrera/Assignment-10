package com.coderscampus.assignment10.web;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;
import com.coderscampus.assignment10.service.MealPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlanController {

    @Autowired
    private MealPlanService mealPlanService;

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(
            @RequestParam(required = false) String numCalories,
            @RequestParam(required = false) String diet,
            @RequestParam(required = false) String exclusions
    ) {
        numCalories = "2500";
        diet = "paleo";
        exclusions = "soy";
        WeekResponse weekMealPlanner = mealPlanService.fetchWeekMealPlanFromSpoonacularAPI(
                                                                        numCalories,
                                                                        diet,
                                                                        exclusions);
        return ResponseEntity.ok(weekMealPlanner);
    }


    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(
            @RequestParam(required = false) String numCalories,
            @RequestParam(required = false) String diet,
            @RequestParam(required = false) String exclusions
    ) {
        numCalories = "3000";
        diet = "vegetarian";
        exclusions = "dairy";
        DayResponse dayMealPlanner = mealPlanService.fetchDayMealPlanFromSpoonacularAPI(
                numCalories,
                diet,
                exclusions);
        return ResponseEntity.ok(dayMealPlanner);
    }


}
