package com.android.daggerexample2;


import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract public class PetrolEnigneModule
{

    @Binds
    abstract Engine bindsEngine(PetrolEnigne enigne);


}
