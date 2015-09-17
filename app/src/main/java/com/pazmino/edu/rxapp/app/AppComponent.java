package com.pazmino.edu.rxapp.app;

import com.pazmino.edu.rxapp.MainActivity;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(App app);

    void inject(MainActivity mainActivity);
}
