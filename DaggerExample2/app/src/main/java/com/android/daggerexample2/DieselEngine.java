package com.android.daggerexample2;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    int horsePower;

    DieselEngine(int horsePower)
    {
     this.horsePower = horsePower;
    }
    @Override
    public void start() {
        Log.d("DieselEngine","Diesel engine has started");
    }
}
