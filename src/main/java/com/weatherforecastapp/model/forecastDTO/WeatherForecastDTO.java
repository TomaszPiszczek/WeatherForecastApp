package com.weatherforecastapp.model.forecastDTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@ToString
@Builder
@Getter
@Setter
public class WeatherForecastDTO {
    private List<String> date;
    private  List<Double> temp;
    private  List<String> description;
    private List<String> icon;
}
