package com.weatherforecastapp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class WeatherDTO {
    private String description;
    private double temp;
    private int humidity;
}
