package com.example.weatherApp.exception;

import com.example.weatherApp.model.WeatherError;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherException extends RuntimeException{

    public WeatherError error;

}
