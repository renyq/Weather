package com.renyq.weather.app;

import android.app.Application;

import com.renyq.weather.net.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public final class ApplicationModule {

    private Application mContext;

    ApplicationModule(Application context) {
        mContext = context;
    }

    @Provides
    @Singleton
    Application provideContext() {
        return mContext;
    }

//    @Provides
//    @Singleton
//    HeWeatherAPI provideAPIService(){
//        return RetrofitHelper.createApi(RxJavaCallAdapterFactory.create());
//    }

    @Provides
    @Singleton
    RetrofitHelper provideRetrofitHelper() {
        return new RetrofitHelper();
    }
}