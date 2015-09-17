package com.pazmino.edu.rxapp.events;

import android.view.View;

import lombok.Data;

public @Data
class ClickedAcceptButtonEvent extends ClickEvent{


    private View view;


    public ClickedAcceptButtonEvent(View v) {
        view = v;
    }
}
