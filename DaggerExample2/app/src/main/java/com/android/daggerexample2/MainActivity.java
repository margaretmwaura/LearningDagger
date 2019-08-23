package com.android.daggerexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    //An injected field cannot be private because the compiler might need to change it at runtime
    @Inject Car car , car1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();


        //This will allow the mainActivity will have all the injected fields
        carComponent.Inject(this);
        car.drive();
        car1.drive();
    }
}
