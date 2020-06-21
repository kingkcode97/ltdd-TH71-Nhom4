package com.FourFashionShop.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.FourFashionShop.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ResetPasswordActivity extends AppCompatActivity {
    Button reset_password_btn;
    TextView tv_forgot_password_go_back;
    EditText forgot_password_email;
    ProgressBar progressBar3;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        tv_forgot_password_go_back = findViewById(R.id.tv_forgot_password_go_back);
        reset_password_btn = findViewById(R.id.btn_resetpassword);
        forgot_password_email = findViewById(R.id.forgot_password_email);
        progressBar3 = findViewById(R.id.progressBar3);

        auth = FirebaseAuth.getInstance();

        tv_forgot_password_go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResetPasswordActivity.this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
            }
        });

        reset_password_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = forgot_password_email.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplication(), "Nhập email đã đăng kí!", Toast.LENGTH_SHORT).show();
                    return;
                }

                progressBar3.setVisibility(View.VISIBLE);

                auth.sendPasswordResetEmail(email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(ResetPasswordActivity.this, "Chúng tôi đã gửi một hướng dẫn đến email của bạn!", Toast.LENGTH_SHORT).show();

                                    Intent intent = new Intent(ResetPasswordActivity.this, LoginActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(ResetPasswordActivity.this, "Xác thực email thất bại!", Toast.LENGTH_SHORT).show();
                                }

                                progressBar3.setVisibility(View.GONE);
                            }
                        });
            }
        });
    }
}
