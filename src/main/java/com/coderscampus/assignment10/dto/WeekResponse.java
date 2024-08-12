package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeekResponse {

    @JsonProperty("week")
    private Week week;

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

}
