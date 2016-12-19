package com.renyq.weather.net;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by root on 16-12-19.
 */
@Singleton
@Component(modules = RetrofitHelperModule.class)
public interface RetrofitHelperComponent {
    RetrofitHelper getRetrofitHelper();
}
