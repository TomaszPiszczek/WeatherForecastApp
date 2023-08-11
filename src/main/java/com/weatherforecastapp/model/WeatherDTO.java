package com.weatherforecastapp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WeatherDTO {
    private String description;
    private double temp;
    private int humidity;
}
