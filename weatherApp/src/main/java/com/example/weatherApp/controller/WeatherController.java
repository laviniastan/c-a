package com.example.weatherApp.controller;


import com.example.weatherApp.exception.ApiException;
import com.example.weatherApp.exception.WeatherException;
import com.example.weatherApp.model.CurrentWeatherResp;
import com.example.weatherApp.service.WeatherService;
import com.example.weatherApp.service.WeatherServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService service;


    /**
     * Method used to retreive current weather and projected forecast for location provided by an address
     *   as well as geo location coordinates (longitude/latitude).
     * @param location - > pass city name or coordinates separated by space
     * @param forecastDays - > number of days for weather forcast
     **/
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful Operation", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = CurrentWeatherResp.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request", content ={@Content(mediaType = "application/json", schema =@Schema())}),
            @ApiResponse(responseCode = "404", description = "Location not found", content ={@Content(mediaType = "application/json", schema =@Schema())}),
            @ApiResponse(responseCode = "500", description = "Internal server error", content ={@Content(mediaType = "application/json", schema =@Schema())})})
    @Operation(description = "Get curent weather information and forecast")
    @GetMapping(value = "/weather",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <?> getWeather(@RequestParam @Parameter(name = "location", description = "Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude Longitude (decimal degree) or city name") String location
                                        , @RequestParam  @Parameter(name="forcastDays", description = "Number of days of weather forecast. Value ranges from 1 to 14 ") int forecastDays) {

        CurrentWeatherResp response = service.getCurrentWeather(location, forecastDays);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
