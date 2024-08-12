package com.coderscampus.assignment10.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Value("${spoonacular.urls.base}")
    private String apiUrlBase;

    @Value("${spoonacular.urls.mealplan}")
    private String apiUrlMealPlanEndpoint;

    public String getApiUrlBase() {
        return apiUrlBase;
    }

    public String getApiUrlMealPlanEndpoint() {
        return apiUrlMealPlanEndpoint;
    }

}
