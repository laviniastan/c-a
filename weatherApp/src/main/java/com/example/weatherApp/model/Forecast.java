package com.example.weatherApp.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Forecast {

    private List<ForecastDay> forecastday;
}
