package com.weatherforecastapp.webclient;


import com.weatherforecastapp.webclient.openWeatherDto.OpenWeatherDTO;
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
    private final String URL = "https://api.openweathermap.org/data/2.5/weather?q={city},uk&appid={API key}";
    private final RestTemplate restTemplate = new RestTemplate();


    public OpenWeatherDTO getCurrentWeather(String city) {
        OpenWeatherDTO openWeatherDTO = restTemplate
                .getForObject(URL, OpenWeatherDTO.class, city, API_KEY);
        assert openWeatherDTO != null;
        log.info(openWeatherDTO.toString());

        return openWeatherDTO;

    }
}





