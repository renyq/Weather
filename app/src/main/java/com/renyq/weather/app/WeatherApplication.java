package com.renyq.weather.app;

import android.app.Application;

public class WeatherApplication extends Application {

    private static WeatherApplication instance;
    private String baseUrl = "https://free-api.heweather.com/v5/";


//    private TasksRepositoryComponent mRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        mRepositoryComponent = DaggerTasksRepositoryComponent.builder()
//                .applicationModule(new ApplicationModule((getApplicationContext())))
//                .tasksRepositoryModule(new TasksRepositoryModule()).build();

    }

    public static synchronized WeatherApplication getInstance() {
        return instance;
    }

//    public TasksRepositoryComponent getTasksRepositoryComponent() {
//        return mRepositoryComponent;
//    }

}
