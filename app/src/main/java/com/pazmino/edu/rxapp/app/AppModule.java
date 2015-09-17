package com.pazmino.edu.rxapp.app;

import android.content.Context;

import com.pazmino.edu.rxapp.models.TodoModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = TodoModule.class)
public class AppModule {


    private final App app;
    private final Context context;


    public AppModule(App app) {
        this.app = app;
        context = app.getApplicationContext();

    }


    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }
}
