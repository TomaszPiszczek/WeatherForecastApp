package com.weatherforecastapp.model.forecastDTO;

import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common.WeatherItem;
import lombok.Builder;
import lombok.ToString;

import java.util.List;
@ToString
@Builder
public class WeatherForecastDTO {
    private List<WeatherData> list;
}
