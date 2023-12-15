package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Current {

    @Schema( example = "1658522700")
    @JsonProperty("last_updated_epoch")
    private int lastUpdatedEpoch;

    @Schema( example = "2022-07-22 16:45")
    @JsonProperty("last_updated")
    private String lastUpdated;

    @Schema( example = "34.4")
    @JsonProperty("temp_c")
    private double tempC;

    @Schema( example = "93.9")
    @JsonProperty("temp_f")
    private double tempF;

    @Schema( example = "1")
    @JsonProperty("is_day")
    private int isDay;

    private Condition condition;

    @Schema( example = "16.1")
    @JsonProperty("wind_mph")
    private double windMph;

    @Schema( example = "25.9")
    @JsonProperty("wind_kph")
    private double windKph;

    @Schema( example = "180")
    @JsonProperty("wind_degree")
    private double windDegree;

    @Schema( example = "S")
    @JsonProperty("wind_dir")
    private String windDir;

    @Schema( example = "1011")
    @JsonProperty("pressure_mb")
    private double pressureMb;

    @Schema( example = "29.85")
    @JsonProperty("pressure_in")
    private double pressureIn;

    @Schema( example = "0")
    @JsonProperty("precip_mm")
    private double precipMm;

    @Schema( example = "0")
    @JsonProperty("precip_in")
    private double precipIn;

    @Schema( example = "31")
    private double humidity;

    @Schema( example = "75")
    private double cloud;

    @Schema( example = "35")
    @JsonProperty("feelslike_c")
    private double feelslikeC;

    @Schema( example = "16")
    @JsonProperty("feelslike_f")
    private double feelslikeF;

    @Schema( example = "16")
    @JsonProperty("vis_km")
    private double visKm;

    @Schema( example = "9")
    @JsonProperty("vis_miles")
    private double visMiles;

    @Schema( example = "8")
    private int uv;

    @Schema( example = "11.6")
    @JsonProperty("gust_mph")
    private double gustMph;

    @Schema( example = "18.7")
    @JsonProperty("gust_kph")
    private double gustKph;


    @JsonProperty("air_quality")
    private AirQuality airQuality;
}
