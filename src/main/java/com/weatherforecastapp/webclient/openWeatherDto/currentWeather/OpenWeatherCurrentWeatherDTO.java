package com.weatherforecastapp.webclient.openWeatherDto.currentWeather;

import com.weatherforecastapp.webclient.openWeatherDto.currentWeather.common.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class OpenWeatherCurrentWeatherDTO {
    private Coord coord;
    private Weather[] weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;


}
