package com.weatherforecastapp.controller;

import com.weatherforecastapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class WeatherController {
    private final WeatherService weatherService;


    @GetMapping("/currentWeather")
    public void getCurrentWeather(){
        log.info(weatherService.getWeatherDto("London").toString());
        weatherService.getWeatherDto("London");
    }
}