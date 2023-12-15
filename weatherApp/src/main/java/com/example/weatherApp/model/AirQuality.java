package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AirQuality {

    @Schema( example = "293.70001220703125")
    private double co;

    @Schema( example = "18.5")
    private double no2;

    @Schema( example = "234.60000610351562")
    private double o3;

    @Schema( example = "12")
    private double so2;

    @Schema( example = "13.60000038146972")
    @JsonProperty("pm2_5")
    private double pm25;

    @Schema( example = "15")
    private double pm10;

    @Schema( example = " 1")
    @JsonProperty("us-epa-index")
    private int usEpaIndex;
}
