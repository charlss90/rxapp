package com.pazmino.edu.rxapp.models;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class TodoServices implements ITodoServices {

    private List todos;


    @Inject
    public TodoServices() {
        todos = new ArrayList<Todo>();
    }


    @Override
    public void save(Todo todo) {
        if (todos != null) {
            todos.add(todo);
        }
    }
}
