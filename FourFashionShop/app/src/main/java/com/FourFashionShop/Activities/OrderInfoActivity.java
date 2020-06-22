package com.FourFashionShop.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.FourFashionShop.Fragments.CartFragment;
import com.FourFashionShop.R;

public class OrderInfoActivity extends AppCompatActivity {
    private TextView txtInfoAccount;
    private Button btnComeHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_info);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayShowHomeEnabled(true);
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setTitle("Hóa Đơn Đặt Hàng");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Hóa đơn đặt hàng");

        txtInfoAccount = (TextView) findViewById(R.id.txtInfoAccount);
        btnComeHome = (Button) findViewById(R.id.btnComeHome);
        txtInfoAccount.setText("Khách hàng: " + LocationUserActivity.name+  "\n\nEmail: " + "admin@gmail.com" + " \n\nĐịa chỉ: " + LocationUserActivity.location +
                "\n\nSố điện thoại: " + LocationUserActivity.phone+ "\n\nThành tiền: " + BeforeOrderActivity.tien + "VNĐ");

        btnComeHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderInfoActivity.this, MainActivity.class);
                startActivity(intent);

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