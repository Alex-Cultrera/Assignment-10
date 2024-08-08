package com.coderscampus.assignment10.spoonacular;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class SpoonacularApi {


    public void callSpoonacularAPI(String numCalories, String diet, String exclusions) {
        RestTemplate restTemplate = new RestTemplate();

        URI weekMealPlannerUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "week")
                .queryParam("targetCalories", numCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "cf4f25161e494e068c917897b5896a55")
                .build()
                .toUri();

        URI dayMealPlannerUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "day")
                .queryParam("targetCalories", numCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "cf4f25161e494e068c917897b5896a55")
                .build()
                .toUri();


        ResponseEntity<WeekResponse> weekResponse = restTemplate.getForEntity(weekMealPlannerUri, WeekResponse.class);
        ResponseEntity<DayResponse> dayResponse = restTemplate.getForEntity(dayMealPlannerUri, DayResponse.class);
    }


}
