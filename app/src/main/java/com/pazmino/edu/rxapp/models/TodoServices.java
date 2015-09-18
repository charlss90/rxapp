package com.pazmino.edu.rxapp.models;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import lombok.NonNull;
import lombok.val;

public class TodoServices implements ITodoServices {

    private List todos;


    @Inject
    public TodoServices() {
        todos = new ArrayList<Todo>();
    }


    @Override
    public void save(@NonNull Todo todo) {

        if (todos != null && todo.isValid()) {
            todos.add(todo);
        }
    }


    @Override
    public void create(@NonNull String title, @NonNull String description) {
        Todo todo = new Todo(title, description);

        if (todo.isValid()) {
            todos.add(todo);
        }
    }
}
