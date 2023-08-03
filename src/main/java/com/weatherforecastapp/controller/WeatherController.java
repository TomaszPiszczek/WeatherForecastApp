package com.weatherforecastapp.controller;

import com.weatherforecastapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j

public class WeatherController {
    private final WeatherService weatherService;


    @GetMapping("/currentWeather")
    public String getCurrentWeather(){

        log.info(weatherService.getWeatherDto("warszawa").toString());

        return "home";
    }


    @GetMapping("/img")
    public String img(){

        log.info(weatherService.getWeatherDto("warszawa").toString());

        return "img";
    }


}