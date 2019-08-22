package com.android.dagger;

//It creates the dependency graph

import dagger.Component;

@Component
public interface CarComponent
{

    //We dont have to specify how the method works it will be
    //done by dagger aince we added the @Component annotation
    //It is retruning what we need
    Car getCar();
}
