package com.weatherforecastapp.controller;

import com.weatherforecastapp.model.WeatherForecastDTO;
import com.weatherforecastapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;

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
    public String getCityWeather(@RequestParam("cityName") String cityName, Model model ) {


            model.addAttribute("weatherData", weatherService.getWeatherForecast(cityName));

        return "cityInfo";
    }




}