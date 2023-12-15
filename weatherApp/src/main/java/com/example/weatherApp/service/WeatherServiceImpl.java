package com.example.weatherApp.service;

import com.example.weatherApp.exception.ApiException;
import com.example.weatherApp.exception.WeatherException;
import com.example.weatherApp.model.CurrentWeatherResp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService{

    private final WebClient webClient ;

    @Value("${weatherApiUrl}")
    private String weatherProvider;
    @Value("${apiKey}")
    private String apiKey;

    public WeatherServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    /**
     * Method used to retreive current weather and projected forecast for location provided by an address
     *   as well as geo location coordinates (longitude/latitude).
     * @param location - > pass city name or coordinates separated by space
     * @param forecastDays - > number of days for weather forcast
     **/
    public CurrentWeatherResp getCurrentWeather(String location,int forecastDays){

        MultiValueMap<String,String> params = new LinkedMultiValueMap<>();
        params.add("q",location);
        params.add("day", String.valueOf(forecastDays));
        params.add("key",apiKey);


        return  webClient.get().uri(weatherProvider,uri-> uri.queryParams(params).build())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(CurrentWeatherResp.class)
                .onErrorMap(e-> {
                    if(e instanceof WebClientResponseException ){
                        WebClientResponseException webErr = (WebClientResponseException) e;
                        log.error ("Error during service call -> {}",webErr.getResponseBodyAsString());

                       try{
                            ObjectMapper mapper = new ObjectMapper();
                            WeatherException err = mapper.readValue(((WebClientResponseException) e).getResponseBodyAsString(),WeatherException.class);
                            return new ApiException(webErr.getRawStatusCode() , err.toString());
                        }
                        catch (JsonProcessingException ex){
                          throw  new RuntimeException(ex);
                        }
                    }
                    log.error("Unknown error has ocuured during service call - > "+e);
                    HttpStatus status= HttpStatus.INTERNAL_SERVER_ERROR;
                    return new ApiException(status.value(),status.getReasonPhrase());
                })
                .block();

    }
}
