package com.renyq.weather.forecast;

import android.support.annotation.Nullable;

/**
 * Created by Jen Yongchiang on 2016/12/14-16:29.
 */

public interface ForecastContract {

    interface View {

        void setProgressIndicator(boolean active);

        void showForecast(String forecast);

    }

    interface UserActionsListener {

        void loadForecast(String city, @Nullable String lang);
    }
}
