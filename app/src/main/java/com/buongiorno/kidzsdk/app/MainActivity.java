package com.buongiorno.kidzsdk.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.docomodigital.Kim;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!Kim.isAccessGranted(this))
            return;

        setContentView(R.layout.activity_main);

    }
}
