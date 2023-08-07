package com.weatherforecastapp.service;

import com.weatherforecastapp.model.WeatherDTO;
import com.weatherforecastapp.model.forecastDTO.WeatherData;
import com.weatherforecastapp.model.forecastDTO.WeatherForecastDTO;
import com.weatherforecastapp.webclient.WeatherClient;
import com.weatherforecastapp.webclient.openWeatherDto.currentWeather.OpenWeatherCurrentWeatherDTO;
import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.OpenWeatherForecastDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;


    public WeatherDTO getWeatherDto(String city){
        OpenWeatherCurrentWeatherDTO openWeatherCurrentWeatherDTO = weatherClient.getCurrentWeather(city);
        return WeatherDTO.builder()
                .temp(openWeatherCurrentWeatherDTO.getMain().getTemp())
                .description(openWeatherCurrentWeatherDTO.getWeather()[0].getDescription())
                .humidity(openWeatherCurrentWeatherDTO.getMain().getHumidity())
                .build();
    }
    // TODO: 07.08.2023 Map OpenWeatherForecastDto to  WeatherForecastDto 

    public WeatherForecastDTO getWeatherForecast(String city){
        OpenWeatherForecastDTO openWeatherForecastDTO = weatherClient.getWeatherForecast(city);

        return WeatherForecastDTO.builder()
                .list(openWeatherForecastDTO.getList())
                .build();

    }

}