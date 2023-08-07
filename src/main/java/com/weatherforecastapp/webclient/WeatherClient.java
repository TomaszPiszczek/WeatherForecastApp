package com.weatherforecastapp.webclient;


import com.weatherforecastapp.webclient.openWeatherDto.currentWeather.OpenWeatherCurrentWeatherDTO;
import com.weatherforecastapp.webclient.openWeatherDto.weatherForecast.OpenWeatherForecastDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * connects to external API
 * returns openWeatherDTO objects
 */
@Slf4j
@Configuration
public class WeatherClient {
    private final String API_KEY = "d6885c9a1ed25d2d1080ae6c3e174aef";
    private final String URL = "https://api.openweathermap.org/data/2.5/{type}?q={city},pl&units=metric&appid={API key}";
    private final RestTemplate restTemplate = new RestTemplate();


    public OpenWeatherCurrentWeatherDTO getCurrentWeather(String city) {
        OpenWeatherCurrentWeatherDTO openWeatherCurrentWeatherDTO = restTemplate
                .getForObject(URL, OpenWeatherCurrentWeatherDTO.class,"weather", city, API_KEY);
        assert openWeatherCurrentWeatherDTO != null;

        return openWeatherCurrentWeatherDTO;

    }

    public OpenWeatherForecastDTO getWeatherForecast(String city) {
        OpenWeatherForecastDTO openWeatherForecastDTO = restTemplate
                .getForObject(URL, OpenWeatherForecastDTO.class,"forecast", city, API_KEY);
        assert openWeatherForecastDTO != null;

        return openWeatherForecastDTO;

    }

}





