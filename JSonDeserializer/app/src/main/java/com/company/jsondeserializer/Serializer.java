package com.company.jsondeserializer;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
     "dt",
     "temp",
     "pressure",
     "humidity",
     "weather",
     "speed",
     "deg",
     "clouds",
     "rain"
})

public class Serializer {

    @JsonProperty("dt")
    private Date dt;

    @JsonProperty("temp")
    private Temperature temp;

    @JsonProperty("pressure")
    private double pressure;

    @JsonProperty("humidity")
    private int humidity;

    @JsonProperty("weather")
    private Weather[] weather;

    @JsonProperty("speed")
    private double speed;

    @JsonProperty("deg")
    private int deg;

    @JsonProperty("clouds")
    private int clouds;

    @JsonProperty("rain")
    private double rain;

    public Serializer(){}

    public Serializer(Date dt, Temperature temp, double pressure, int humidity, Weather[] weather, double speed, int deg, int clouds, double rain) {
        this.dt = dt;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.weather = weather;
        this.speed = speed;
        this.deg = deg;
        this.clouds = clouds;
        this.rain = rain;
    }
    @JsonProperty("dt")
    public Date getDt() {
        return dt;
    }
    @JsonProperty("dt")
    public void setDt(Date dt) {
        this.dt = dt;
    }
    @JsonProperty("temp")
    public Temperature getTemp() {
        return temp;
    }
    @JsonProperty("temp")
    public void setTemp(Temperature temp) {
        this.temp = temp;
    }
    @JsonProperty("pressure")
    public double getPressure() {
        return pressure;
    }
    @JsonProperty("pressure")
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }
    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    @JsonProperty("weather")
    public Weather[] getWeather() {
        return weather;
    }
    @JsonProperty("weather")
    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }
    @JsonProperty("speed")
    public double getSpeed() {
        return speed;
    }
    @JsonProperty("speed")
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @JsonProperty("deg")
    public int getDeg() {
        return deg;
    }
    @JsonProperty("deg")
    public void setDeg(int deg) {
        this.deg = deg;
    }
    @JsonProperty("clouds")
    public int getClouds() {
        return clouds;
    }
    @JsonProperty("clouds")
    public void setClouds(int clouds) {
        this.clouds = clouds;
    }
    @JsonProperty("rain")
    public double getRain() {
        return rain;
    }
    @JsonProperty("rain")
    public void setRain(double rain) {
        this.rain = rain;
    }
}
