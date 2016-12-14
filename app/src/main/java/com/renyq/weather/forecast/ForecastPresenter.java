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

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public final class ForecastPresenter implements ForecastContract.UserActionsListener {

    private final ForecastContract.View mForecastView;

    @Inject
    public ForecastPresenter(ForecastContract.View forecastView) {
        mForecastView = forecastView;
    }

    @Override
    public void loadForecast() {
        mForecastView.setProgressIndicator(true);

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://free-api.heweather.com/v5/forecast?city=beijing&key=331f4c7b25594566a159950a0c6398ff")
                .get()
                .build();


        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                mForecastView.setProgressIndicator(false);
                mForecastView.showForecast("error");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                mForecastView.setProgressIndicator(false);
                mForecastView.showForecast(response.body().string());
            }
        });

    }
}
