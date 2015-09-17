package com.pazmino.edu.rxapp.models;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TodoModule {


    @Provides
    @Singleton
    ITodoServices providerTodoServices(TodoServices todoServices) {
        return todoServices;
    }
}
