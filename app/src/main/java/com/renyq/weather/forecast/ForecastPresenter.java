/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.renyq.weather.forecast;

import android.support.annotation.Nullable;

import com.renyq.weather.app.Constants;
import com.renyq.weather.net.RetrofitHelper;

import javax.inject.Inject;

import rx.Subscription;
import rx.functions.Action1;


public final class ForecastPresenter implements ForecastContract.UserActionsListener {

    private final ForecastContract.View mForecastView;
    private final RetrofitHelper mRetrofitHelper;

    @Inject
    public ForecastPresenter(ForecastContract.View forecastView, RetrofitHelper mRetrofitHelper) {
        mForecastView = forecastView;
        this.mRetrofitHelper = mRetrofitHelper;
    }

    @Override
    public void loadForecast(String city, @Nullable String lang) {
        mForecastView.setProgressIndicator(true);
        Subscription rxSubscription = mRetrofitHelper.getWeatherApiService()
                .getForecast(city, Constants.HEWEATHER_API, null)
                .subscribe(new Action1<Forecast>() {
                    @Override
                    public void call(Forecast forecast) {
                        mForecastView.setProgressIndicator(false);
                        mForecastView.showForecast(forecast.toString());
                    }
                });

//        OkHttpClient client = new OkHttpClient();
//
//        Request request = new Request.Builder()
//                .url("https://free-api.heweather.com/v5/forecast?city=beijing&key=331f4c7b25594566a159950a0c6398ff")
//                .get()
//                .build();
//
//
//        client.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                mForecastView.setProgressIndicator(false);
//                mForecastView.showForecast("error");
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                mForecastView.setProgressIndicator(false);
//                mForecastView.showForecast(response.body().string());
//            }
//        });

    }
}
