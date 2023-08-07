package com.weatherforecastapp.service;

import com.weatherforecastapp.model.WeatherDTO;
import com.weatherforecastapp.model.forecastDTO.WeatherForecastDTO;
import com.weatherforecastapp.webclient.WeatherClient;
import com.weatherforecastapp.webclient.openWeatherDto.currentWeather.OpenWeatherCurrentWeatherDTO;
import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.OpenWeatherForecastDTO;
import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common.MainData;
import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common.Weather;
import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.common.WeatherItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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


    public WeatherForecastDTO getWeatherForecast(String city){
        OpenWeatherForecastDTO openWeatherForecastDTO = weatherClient.getWeatherForecast(city);


        List<String> date = openWeatherForecastDTO.getList()
                .stream()
                .map(WeatherItem::getDt_txt)
                .collect(Collectors.toList());

        List<Double> temp = openWeatherForecastDTO.getList()
                .stream()
                .map(WeatherItem::getMain)
                .map(MainData::getTemp)
                .toList();

        List<String> description = openWeatherForecastDTO.getList()
                .stream()
                .map(WeatherItem::getWeather)
                .flatMap(List::stream)
                .map(Weather::getDescription)
                .toList();

        List<String> icon = openWeatherForecastDTO.getList()
                .stream()
                .map(WeatherItem::getWeather)
                .flatMap(List::stream)
                .map(Weather::getIcon)
                .toList();




        return WeatherForecastDTO.builder()
                .date(date)
                .temp(temp)
                .icon(icon)
                .description(description)
                .build();

    }

}