package com.android.daggerexample2;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule
{

    int horsepower;

    public DieselEngineModule(int horsepower)
    {
        this.horsepower = horsepower;
    }
    @Provides
    Engine horseEngine()
    {
         return new DieselEngine(horsepower);
    }
}
