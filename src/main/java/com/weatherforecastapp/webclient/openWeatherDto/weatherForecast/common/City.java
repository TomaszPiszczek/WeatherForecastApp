package com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common;

import lombok.Getter;

@Getter
public class City {
    private int id;
    private String name;
    private Coord coord;
    private String country;
    private int population;
    private int timezone;
    private long sunrise;
    private long sunset;
}
