package com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;
}
