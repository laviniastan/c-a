package com.example.weatherApp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Condition {

    @Schema( example = "Sunny")
    private String text;

    @Schema( example = " //cdn.weatherapi.com/weather/64x64/day/113.png")
    private String icon;

    @Schema( example = "1000")
    private int code;

}
