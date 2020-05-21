package com.example.fashionshop.ui;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.fashionshop.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btRegister;
    private TextView tvLogin, tvDesc;
    private Button loginButton;
    private ScrollView sv;
    private Animation svAnim;
    private Toolbar bgHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btRegister  = findViewById(R.id.btRegister);
        tvLogin     = findViewById(R.id.tvLogin);
        tvDesc     = findViewById(R.id.tvDesc);
        loginButton = findViewById(R.id.loginBt);
        bgHeader = findViewById(R.id.bgHeader);
        sv = findViewById(R.id.sv);
        btRegister.setOnClickListener(this);

//        bgHeader.animate().translationY(500).setDuration(800).setStartDelay(300);

        svAnim = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        sv.animate();
        sv.startAnimation(svAnim);
        tvDesc.animate();
        tvDesc.startAnimation(svAnim);
        tvLogin.animate();
        tvLogin.startAnimation(svAnim);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    public void onClick(View v) {
        if (v==btRegister){
            Intent intent   = new Intent(LoginActivity.this, RegisterActivity.class);
            Pair[] pairs    = new Pair[1];
            pairs[0] = new Pair<View,String>(tvLogin,"tvLogin");
            ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this, pairs);
            startActivity(intent,activityOptions.toBundle());
        }
    }
}