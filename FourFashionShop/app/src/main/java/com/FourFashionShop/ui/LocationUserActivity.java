package com.FourFashionShop.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.FourFashionShop.R;
public class LocationUserActivity extends AppCompatActivity {
    private Button btSaveLocation;
    private Button btnVanPhong, btnNhaRieng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_user);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Thêm Địa Chỉ Giao Hàng");

        btSaveLocation = findViewById(R.id.btSaveLocation);

        btSaveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code luu location

                //
                Intent comeback = new Intent(getApplication(), BeforeOrderActivity.class);
                startActivity(comeback);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}




