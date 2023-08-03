package com.weatherforecastapp.webclient.openWeatherDto.common;

import lombok.Getter;

@Getter
public class Main {
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
}
