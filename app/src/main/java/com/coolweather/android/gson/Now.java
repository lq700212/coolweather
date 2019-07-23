package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Desction:coolWeather
 * Author:ryan.lei
 * Date:2019-07-23 11:44
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
