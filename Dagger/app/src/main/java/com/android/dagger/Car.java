package com.android.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car
{
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;

    //This is the way to create a car
    //can only be used in constructor
    @Inject
    public Car(Engine engine, Wheels wheels)
    {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive()
    {
        Log.d(TAG,"Driving");
    }

}
