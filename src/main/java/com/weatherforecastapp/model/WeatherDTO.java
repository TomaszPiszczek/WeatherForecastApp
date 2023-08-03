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
    private double temp;
    private double longitude;
    private double latitude;



}
