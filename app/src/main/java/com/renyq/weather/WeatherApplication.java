package com.renyq.weather;

import android.app.Application;

public class WeatherApplication extends Application {

    private String baseUrl = "https://free-api.heweather.com/v5/";

//    private TasksRepositoryComponent mRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        mRepositoryComponent = DaggerTasksRepositoryComponent.builder()
//                .applicationModule(new ApplicationModule((getApplicationContext())))
//                .tasksRepositoryModule(new TasksRepositoryModule()).build();

    }

//    public TasksRepositoryComponent getTasksRepositoryComponent() {
//        return mRepositoryComponent;
//    }

}
