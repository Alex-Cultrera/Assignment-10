package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpoonacularApiResponse {

@JsonProperty("meals")
private Meals meals;

@JsonProperty("nutrients")
private Nutrients nutrients;
//test
}
