package com.renyq.weather.net;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public final class RetrofitHelperModule {

    @Provides
    @Singleton
    RetrofitHelper provideRetrofitHelper() {
        return new RetrofitHelper();
    }
}