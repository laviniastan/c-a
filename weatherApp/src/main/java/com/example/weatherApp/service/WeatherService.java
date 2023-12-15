package com.example.weatherApp.service;

import com.example.weatherApp.model.CurrentWeatherResp;

public interface WeatherService {
    CurrentWeatherResp getCurrentWeather(String location,int forecastDays);
}
