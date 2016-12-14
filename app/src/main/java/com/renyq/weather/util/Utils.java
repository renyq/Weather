package com.renyq.weather.util;

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
}
