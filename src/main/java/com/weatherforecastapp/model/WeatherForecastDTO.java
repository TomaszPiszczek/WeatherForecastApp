package com.weatherforecastapp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Builder
@Getter
@Setter
public class WeatherForecastDTO {
    private List<String> date;
    private  List<Double> temp;
    private  List<String> description;
    private List<String> icon;
}
