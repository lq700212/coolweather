package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Desction:coolWeather
 * Author:ryan.lei
 * Date:2019-07-22 20:55
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
