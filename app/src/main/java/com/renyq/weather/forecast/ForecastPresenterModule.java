package com.renyq.weather.forecast;

import dagger.Module;
import dagger.Provides;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link ForecastPresenter}.
 */
@Module
public class ForecastPresenterModule {

    private final ForecastContract.View mView;

    public ForecastPresenterModule(ForecastContract.View view) {
        mView = view;
    }

    @Provides
    ForecastContract.View provideTasksContractView() {
        return mView;
    }

}
