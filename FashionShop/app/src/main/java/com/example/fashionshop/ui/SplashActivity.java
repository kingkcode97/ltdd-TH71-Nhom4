package com.example.fashionshop.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.fashionshop.R;

public class SplashActivity extends AppCompatActivity{

    private final int SPLASH_DELAY = 5000;

    ImageView logoImage;
    Animation anim_alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logoImage = (ImageView) findViewById(R.id.logoLoading);

        anim_alpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        logoImage.animate();
        logoImage.startAnimation(anim_alpha);

        gotoSplashActivity();
    }

    private void gotoSplashActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        }, SPLASH_DELAY);
    }
}
