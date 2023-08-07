package com.weatherforecastapp.model.forecastDTO;

import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common.MainData;
import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common.Weather;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@ToString
@Setter
@Getter
@Builder
public class WeatherData {
    private Main main;
    private List<Weather> weather;
    private String dt_txt;
}
