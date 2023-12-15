package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Astro {

    @Schema( example = "05:44 AM")
    public String sunrise;

    @Schema( example = " 08:20 PM")
    public String sunset;

    @Schema( example = "12:58 AM")
    public String moonrise;

    @Schema( example = "03:35 PM")
    public String moonset;

    @Schema( example = "Last Quarter")
    @JsonProperty("moon_phase")
    public String moonPhase;

    @Schema( example = "36")
    @JsonProperty("moon_illumination")
    public String moonIllumination;
}
