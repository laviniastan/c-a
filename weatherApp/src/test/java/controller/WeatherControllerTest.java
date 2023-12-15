package controller;

import com.example.weatherApp.controller.WeatherController;
import com.example.weatherApp.model.CurrentWeatherResp;
import com.example.weatherApp.service.WeatherService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

    @InjectMocks
    WeatherController controller;

    @Mock
    WeatherService service = mock(WeatherService.class);

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Test successful request
     * */
    @Test
    public void weather_200(){
        String location = "Bucharest";
        int forecastDay = 1;

        CurrentWeatherResp mockResponse = mock(CurrentWeatherResp.class);

        when(service.getCurrentWeather(location,forecastDay)).thenReturn(mockResponse);

        ResponseEntity<?> controllerResponse = controller.getWeather(location,forecastDay);

        assertThat(controllerResponse.getStatusCode().is2xxSuccessful());
        assertThat(controllerResponse.equals(mockResponse));
    }

    /**
    * Test a 400 response code when the location is not provided
    * */

    @Test
    public void weather_400(){

        int forecastDay = 1;

        ResponseEntity<?> controllerResponse = controller.getWeather(null,forecastDay);

        assertThat(controllerResponse.getStatusCode().is4xxClientError());
    }
}
