package com.renyq.weather.util;

import android.content.Context;
import android.net.ConnectivityManager;

import com.renyq.weather.app.WeatherApplication;

/**
 * Created by Jen Yongchiang on 2016/12/14-16:12.
 */

public class Utils {

    public static <T> T checkNotNull(T reference) {
        if(reference == null) {
            throw new NullPointerException();
        } else {
            return reference;
        }
    }

    /**
     * 检查是否有可用网络
     */
    public static boolean isNetworkConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) WeatherApplication.getInstance().getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null;
    }
}
