package com.weatherforecastapp.controller;

import com.weatherforecastapp.model.forecastDTO.WeatherData;
import com.weatherforecastapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/cityWeather")
    public String getCityWeather(@RequestParam("cityName") String cityName, Model model ){

        log.info(weatherService.getWeatherForecast(cityName).toString());

        return "home";
    }




}