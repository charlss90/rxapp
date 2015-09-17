package com.pazmino.edu.rxapp.models;

public interface ITodoServices {

    void save(Todo todo);

    void create(String title, String description);
}
