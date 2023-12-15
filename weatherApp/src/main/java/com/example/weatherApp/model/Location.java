package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Location {

    @Schema( example = "New York")
    private String name;

    @Schema( example = "New York")
    private String region;

    @Schema( example = "United States of America")
    private String country;

    @Schema( example = "40.71")
    private double lat;

    @Schema( example = "-74.01")
    private double lon;

    @Schema( example = " America/New_York")
    @JsonProperty("tz_id")
    private String tzId;

    @Schema( example = "1658522976")
    @JsonProperty("localtime_epoch")
    int localTimeEpoch;

    @Schema( example = "2022-07-22 16:49")
    @JsonProperty("localtime")
    private String localTime;

}
