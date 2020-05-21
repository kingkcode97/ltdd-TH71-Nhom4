package com.example.fashionshop.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;

import com.example.fashionshop.R;

public class SplashActivity extends AppCompatActivity {

    Button joinNowButton;
    Button finishButton;
    Animation transition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        joinNowButton = findViewById(R.id.joinNowBtn);
        finishButton = findViewById(R.id.finishBtn);

        transition = AnimationUtils.loadAnimation(this, R.anim.transition);
        joinNowButton.startAnimation(transition);
        finishButton.startAnimation(transition);

        joinNowButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
                startActivity(intent);

            }
        });

        finishButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
