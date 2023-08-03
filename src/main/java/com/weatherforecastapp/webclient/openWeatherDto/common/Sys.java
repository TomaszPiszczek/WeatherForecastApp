package com.weatherforecastapp.webclient.openWeatherDto.common;

import lombok.Getter;

@Getter
public class Sys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;
}
