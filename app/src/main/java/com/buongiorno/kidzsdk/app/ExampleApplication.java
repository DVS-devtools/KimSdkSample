package com.buongiorno.kidzsdk.app;

import android.app.Application;

import com.docomodigital.Kim;

/**
 * Created by tobia on 16/11/2016.
 */

public class ExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Kim.with(this, "com.pocoyo.house");
    }
}
