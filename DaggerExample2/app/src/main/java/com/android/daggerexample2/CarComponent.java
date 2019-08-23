package com.android.daggerexample2;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
//We cannot use both petrol and diesel engine modules here because dagger engine will have been bound twice
@Component(modules = {WheelsModule.class,DieselEngineModule.class})
public interface CarComponent
{

    Car getCar();

    void Inject(MainActivity mainActivity);
}
