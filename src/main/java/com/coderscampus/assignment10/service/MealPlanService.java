package com.coderscampus.assignment10.service;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.net.URI;

@Service
public class MealPlanService {

    public WeekResponse fetchWeekMealPlanFromSpoonacularAPI(BigDecimal numCalories, String diet, String exclusions) {

        RestTemplate restTemplate1 = new RestTemplate();

        URI weekMealPlannerUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "week")
                .queryParam("targetCalories", numCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "cf4f25161e494e068c917897b5896a55")
                .build()
                .toUri();

        ResponseEntity<WeekResponse> weekResponse = restTemplate1.getForEntity(weekMealPlannerUri, WeekResponse.class);
        return weekResponse.getBody();
    }

    public DayResponse getOneDayMealPlanFromSpoonacularAPI(BigDecimal numCalories, String diet, String exclusions) {

        RestTemplate restTemplate2 = new RestTemplate();

        URI dayMealPlannerUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "day")
                .queryParam("targetCalories", numCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "cf4f25161e494e068c917897b5896a55")
                .build()
                .toUri();

        ResponseEntity<DayResponse> dayResponse = restTemplate2.getForEntity(dayMealPlannerUri, DayResponse.class);
        return dayResponse.getBody();
    }


}
