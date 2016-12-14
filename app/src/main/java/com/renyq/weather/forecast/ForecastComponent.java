package com.renyq.weather.forecast;

import com.renyq.weather.util.FragmentScoped;

import dagger.Component;

/**
 * Created by Jen Yongchiang on 2016/12/14-17:30.
 */
@FragmentScoped
@Component(modules = ForecastPresenterModule.class)
public interface ForecastComponent {
    ForecastPresenter getForecastPresenter();
}
