package com.weatherforecastapp.service;

import com.weatherforecastapp.model.WeatherDTO;
import com.weatherforecastapp.webclient.WeatherClient;
import com.weatherforecastapp.webclient.openWeatherDto.OpenWeatherDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;


    public WeatherDTO getWeatherDto(String city){
        OpenWeatherDTO openWeatherDTO = weatherClient.getCurrentWeather(city);
        return WeatherDTO.builder()
                .latitude(openWeatherDTO.getCoord().getLat())
                .longitude(openWeatherDTO.getCoord().getLon())
                .temp(openWeatherDTO.getMain().getTemp())
                .build();
    }

}