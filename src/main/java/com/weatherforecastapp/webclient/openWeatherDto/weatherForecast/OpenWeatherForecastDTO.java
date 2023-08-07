package com.weatherforecastapp.webclient.openWeatherDto.weatherForecast;

import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;
@RequiredArgsConstructor
@Getter
public class OpenWeatherForecastDTO {
    private int cod;
    private int message;
    private int cnt;
    private List<WeatherItem> list;
    private City city;
}
