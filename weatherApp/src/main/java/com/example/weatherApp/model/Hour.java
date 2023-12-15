package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Hour {

    @Schema( example = "1658462400")
    @JsonProperty("time_epoch")
    public int timeEpoch;

    @Schema( example = "2022-07-22 00:00")
    public String time;

    @Schema( example = "28.7")
    @JsonProperty("temp_c")
    public double tempC;

    @Schema( example = "83.7")
    @JsonProperty("temp_f")
    public double tempF;

    @Schema( example = "0")
    @JsonProperty("is_day")
    public int isDay;

    public Condition condition;

    @Schema( example = "9.4")
    @JsonProperty("wind_mph")
    public double wind_mMph;

    @Schema( example = "15.1")
    @JsonProperty("wind_kph")
    public double windKh;

    @Schema( example = "265")
    @JsonProperty("wind_degree")
    public int windDegree;

    @Schema( example = "W")
    @JsonProperty("wind_dir")
    public String windDir;

    @Schema( example = "1007")
    @JsonProperty("pressure_mb")
    public int pressureMb;

    @Schema( example = "29.73")
    @JsonProperty("pressure_in")
    public double pressureIn;

    @Schema( example = "0")
    @JsonProperty("precip_mm")
    public int precipMm;

    @Schema( example = "0")
    @JsonProperty("precip_in")
    public int precipIn;

    @Schema( example = "58")
    public int humidity;

    @Schema( example = "19")
    public int cloud;

    @Schema( example = "30.5")
    @JsonProperty("feelslike_c")
    public double feelsLikeC;

    @Schema( example = "86.9")
    @JsonProperty("feelslike_f")
    public double feelsLikeF;

    @Schema( example = "28.7")
    @JsonProperty("windchill_c")
    public double windChillC;

    @Schema( example = "83.7")
    @JsonProperty("windchill_f")
    public double windChillF;

    @Schema( example = "30.5")
    @JsonProperty("heatindex_c")
    public double heatIndexC;

    @Schema( example = "86.9")
    @JsonProperty("heatindex_f")
    public double heatIndexF;

    @Schema( example = "19.6")
    @JsonProperty("dewpoint_c")
    public double dewpointC;

    @Schema( example = "67.3")
    @JsonProperty("dewpoint_f")
    public double dewpointF;

    @Schema( example = "0")
    @JsonProperty("will_it_rain")
    public int willItRain;

    @Schema( example = "0")
    @JsonProperty("chance_of_rain")
    public int chanceOfRain;

    @Schema( example = "0")
    @JsonProperty("will_it_snow")
    public int willItSnow;

    @Schema( example = "0")
    @JsonProperty("chance_of_snow")
    public int chanceOfSnow;

    @Schema( example = "10")
    @JsonProperty("vis_km")
    public int visKm;

    @Schema( example = "6")
    @JsonProperty("vis_miles")
    public int visMiles;

    @Schema( example = "15")
    @JsonProperty("gust_mph")
    public int gustMph;

    @Schema( example = "24.1")
    @JsonProperty("gust_kph")
    public double gustKph;

    @Schema( example = "1")
    public int uv;
}
