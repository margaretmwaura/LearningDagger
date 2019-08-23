package com.android.daggerexample2;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEnigne implements Engine {

    @Inject
    PetrolEnigne()
    {

    }
    @Override
    public void start() {
        Log.d("PetrolEnigne","Petrol Engine has started ");
    }
}
