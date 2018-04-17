package com.coolweather.android.gson;

/**
 * Created by peng on 2018/4/16.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
