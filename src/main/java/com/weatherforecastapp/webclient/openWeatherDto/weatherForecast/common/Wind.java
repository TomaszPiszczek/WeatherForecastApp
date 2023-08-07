package com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common;

import lombok.Getter;

@Getter
public class Wind {
    private double speed;
    private int deg;
    private double gust;
}
