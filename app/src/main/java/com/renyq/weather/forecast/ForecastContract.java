package com.renyq.weather.forecast;

import java.util.List;

/**
 * Created by Jen Yongchiang on 2016/12/14-16:29.
 */

public interface ForecastContract {

    interface View {

        void setProgressIndicator(boolean active);

        void showForecast(String forecast);

    }

    interface UserActionsListener {

        void loadForecast();
    }
}
