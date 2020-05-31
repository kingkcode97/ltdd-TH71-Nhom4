<<<<<<< HEAD:FourFashionShop/app/src/main/java/com/FourFashionShop/ui/activity/UserInfoActivity.java
package com.FourFashionShop.ui.activity;

=======
package com.FourFashionShop.ui;
import androidx.annotation.NonNull;
>>>>>>> f004ec52c1fce23536c55f88053da0616eb0b61a:FourFashionShop/app/src/main/java/com/FourFashionShop/ui/UserInfoActivity.java
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
<<<<<<< HEAD:FourFashionShop/app/src/main/java/com/FourFashionShop/ui/activity/UserInfoActivity.java

import com.FourFashionShop.R;

public class UserInfoActivity extends AppCompatActivity {

=======
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.FourFashionShop.R;


public class UserInfoActivity extends AppCompatActivity {


>>>>>>> f004ec52c1fce23536c55f88053da0616eb0b61a:FourFashionShop/app/src/main/java/com/FourFashionShop/ui/UserInfoActivity.java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

<<<<<<< HEAD:FourFashionShop/app/src/main/java/com/FourFashionShop/ui/activity/UserInfoActivity.java
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Thông tin tài khoản");

    }
}
=======
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Thông tin tài khoản");


        Button btnUpdate = findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Đã cập nhật thông tin cá nhân!", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
>>>>>>> f004ec52c1fce23536c55f88053da0616eb0b61a:FourFashionShop/app/src/main/java/com/FourFashionShop/ui/UserInfoActivity.java
