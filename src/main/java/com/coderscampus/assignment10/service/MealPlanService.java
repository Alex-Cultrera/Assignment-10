package com.coderscampus.assignment10.service;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class MealPlanService {

    @Autowired
    private RestTemplate restTemplate;

    public WeekResponse fetchWeekMealPlanFromSpoonacularAPI(String numCalories, String diet, String exclusions) {

        URI weekMealPlannerUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "week")
                .queryParam("targetCalories", Integer.parseInt(numCalories))
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "cf4f25161e494e068c917897b5896a55")
                .build()
                .toUri();

        ResponseEntity<WeekResponse> weekResponse = restTemplate.getForEntity(weekMealPlannerUri, WeekResponse.class);
        return weekResponse.getBody();
    }

    public DayResponse fetchDayMealPlanFromSpoonacularAPI(String numCalories, String diet, String exclusions) {

        URI dayMealPlannerUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "day")
                .queryParam("targetCalories", Integer.parseInt(numCalories))
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "cf4f25161e494e068c917897b5896a55")
                .build()
                .toUri();

        ResponseEntity<DayResponse> dayResponse = restTemplate.getForEntity(dayMealPlannerUri, DayResponse.class);
        return dayResponse.getBody();
    }


}
