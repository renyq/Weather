package com.renyq.weather.forecast;

import com.renyq.weather.net.RetrofitHelper;

import dagger.Module;
import dagger.Provides;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link ForecastPresenter}.
 */
@Module
public class ForecastPresenterModule {

    private final ForecastContract.View mView;
    private final RetrofitHelper mRetrofitHelper;

    public ForecastPresenterModule(ForecastContract.View view, RetrofitHelper retrofitHelper) {
        mView = view;
        mRetrofitHelper = retrofitHelper;
    }

    @Provides
    ForecastContract.View provideTasksContractView() {
        return mView;
    }

    @Provides
    RetrofitHelper provideRetrofitHelper() {
        return mRetrofitHelper;
    }

}
