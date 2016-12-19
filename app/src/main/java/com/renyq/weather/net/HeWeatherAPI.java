package com.renyq.weather.net;


import com.renyq.weather.forecast.Forecast;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by renyq on 16-12-19
 * Email:renyongqiang.china@hotmail.com
 */

public interface HeWeatherAPI {
    String BaseUrl = "https://free-api.heweather.com/v5/";


    /**
     * 7-10天预报
     */
    @GET("forecast")
    Observable<Forecast> getForecast(@Path("city") String city,@Path("key") String key,@Path("lang") String lang);

//    getForecast()
}
