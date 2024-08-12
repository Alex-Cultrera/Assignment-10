package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Week {

    @JsonProperty("monday")
    private Monday monday;

    @JsonProperty("tuesday")
    private Tuesday tuesday;

    @JsonProperty("wednesday")
    private Wednesday wednesday;

    @JsonProperty("thursday")
    private Thursday thursday;

    @JsonProperty("friday")
    private Friday friday;

    @JsonProperty("saturday")
    private Saturday saturday;

    @JsonProperty("sunday")
    private Sunday sunday;
}
