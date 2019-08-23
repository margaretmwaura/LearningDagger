package com.android.daggerexample2;


import javax.inject.Inject;


public class Wheels
{
    public Rims rims;
    public Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
