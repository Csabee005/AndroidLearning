package com.company.jsondeserializer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "day",
        "min",
        "max"
})
public class Temperature {

    @JsonProperty("day")
    private double day;

    @JsonProperty("min")
    private double min;

    @JsonProperty("max")
    private double max;

    public Temperature(double day, double min, double max) {
        this.day = day;
        this.min = min;
        this.max = max;
    }

    public Temperature() { }

    @JsonProperty("day")
    public double getDay() {
        return day;
    }
    @JsonProperty("day")
    public void setDay(double day) {
        this.day = day;
    }
    @JsonProperty("min")
    public int getMin() {
        return (int)Math.round(min);
    }
    @JsonProperty("min")
    public void setMin(double min) {
        this.min = min;
    }
    @JsonProperty("max")
    public int getMax() {
        return (int)Math.round(max);
    }
    @JsonProperty("max")
    public void setMax(double max) {
        this.max = max;
    }
}
