package com.android.daggerexample2;

import android.util.Log;

import javax.inject.Inject;

public class Car {


    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    //This is the way to create a car
    //can only be used in constructor

    @Inject
    public Car(Driver driver , Engine engine, Wheels wheels)
    {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive()
    {
        engine.start();
        Log.d(TAG,"Driving" + driver + " " + this);
    }
}
