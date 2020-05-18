package com.example.fashionshop.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.fashionshop.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // Start home activity
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        // Close splash activity
        finish();
    }
}
