package com.weatherforecastapp.model.forecastDTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Builder
public class Main {
    private double temp;
    private int humidity;

}
