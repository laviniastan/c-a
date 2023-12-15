package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Day {

    @Schema( example = "35.9")
    @JsonProperty("maxtemp_c")
    public double maxtTmpC;

    @Schema( example = "96.6")
    @JsonProperty("maxtemp_f")
    public double maxTempF;

    @Schema( example = "26.3")
    @JsonProperty("mintemp_c")
    public double minTempC;

    @Schema( example = " 79.3")
    @JsonProperty("mintemp_f")
    public double minTempF;

    @Schema( example = "30.7")
    @JsonProperty("avgtemp_c")
    public double avgTempC;

    @Schema( example = "87.3")
    @JsonProperty("avgtemp_f")
    public double avgTempF;

    @Schema( example = "15")
    @JsonProperty("maxwind_mph")
    public double maxWindMph;

    @Schema( example = "12.8")
    @JsonProperty("maxwind_kph")
    public double maxWindKph;

    @Schema( example = "0")
    @JsonProperty("totalprecip_mm")
    public int totalprecipMm;

    @Schema( example = "0")
    @JsonProperty("totalprecip_in")
    public int totalprecipIn;

    @Schema( example = "0")
    @JsonProperty("avgvis_km")
    public int avgvisKm;

    @Schema( example = "6")
    @JsonProperty("avgvis_miles")
    public int avgvisMiles;

    @Schema( example = "53")
    @JsonProperty("avghumidity")
    public int avgHumidity;

    @Schema( example = "0")
    @JsonProperty("daily_will_it_rain")
    public int dailyWillItRain;

    @Schema( example = "0")
    @JsonProperty("daily_chance_of_rain")
    public int dailyChanceOfRain;

    @Schema( example = "0")
    @JsonProperty("daily_will_it_snow")
    public int dailyWillTtSnow;

    @Schema( example = "0")
    @JsonProperty("daily_chance_of_snow")
    public int dailyChanceOfSnow;

    public Condition condition;

    @Schema( example = "8")
    public int uv;
}
