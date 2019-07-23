package com.coolweather.android.gson;

/**
 * Desction:coolWeather
 * Author:ryan.lei
 * Date:2019-07-23 11:43
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
