package com.pazmino.edu.rxapp.navigation;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;

public class CustomActionBarDrawerToggle extends ActionBarDrawerToggle implements ICustomActionBarDrawerToggle {


    private final Fragment fragment;
    private final FragmentActivity fragmentActivity;


    public CustomActionBarDrawerToggle(
            Activity activity,
            DrawerLayout drawerLayout,
            int openDrawerContentDescRes,
            int closeDrawerContentDescRes,
            Fragment fragment,
            FragmentActivity fragmentActivity) {
        super(activity, drawerLayout, openDrawerContentDescRes, closeDrawerContentDescRes);

        this.fragment = fragment;
        this.fragmentActivity = fragmentActivity;
    }

    @Override
    public void onDrawerClosed(View drawerView) {
        super.onDrawerClosed(drawerView);
        if(!fragment.isAdded()) {
            return;
        }

        fragmentActivity.supportInvalidateOptionsMenu();
    }
}
