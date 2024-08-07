package com.coderscampus.assignment10.spoonacular;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class SpoonacularApi {


    public void callSpoonacularAPI() {
        RestTemplate restTemplate = new RestTemplate();

        URI mealPlannerUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "blank")
                .queryParam("targetCalories", "blank")
                .queryParam("diet", "blank")
                .queryParam("exclude", "blank")
                .build()
                .toUri();


        ResponseEntity<SpoonacularApiResponse> response = restTemplate.getForEntity(mealPlannerUri, SpoonacularApiResponse.class);
    }
}
