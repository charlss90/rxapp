package com.pazmino.edu.rxapp.models;

import lombok.Data;

public
@Data
class Todo {


    private String title;
    private String description;


    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }


    public boolean isValid() {
        return title != null &&
                !title.isEmpty() &&
                description != null &&
                !description.isEmpty();
    }
}
