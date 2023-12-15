package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ForecastDay {

    @Schema(example = " 2022-07-22")
    private  String date;

    @Schema(example = " 1658448000")
    @JsonProperty("date_epoch")
    private int  dateEpoch;

    private Day day;

    private Astro astro;

    public List<Hour> hour;
}
