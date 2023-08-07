package com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
public class WeatherItem {
    private long dt;
    private MainData main;
    private List<Weather> weather;
    private Clouds clouds;
    private Wind wind;
    private int visibility;
    private double pop;
    private Rain rain;
    private Sys sys;
    private String dt_txt;
}
