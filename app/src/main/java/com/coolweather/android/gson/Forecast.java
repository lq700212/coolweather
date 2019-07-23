package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Desction:coolWeather
 * Author:ryan.lei
 * Date:2019-07-23 11:50
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
