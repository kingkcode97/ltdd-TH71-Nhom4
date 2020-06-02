package com.FourFashionShop.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.FourFashionShop.R;
import com.FourFashionShop.ui.Adapter.BeforeOrderAdapter;
import com.FourFashionShop.ui.Adapter.CartAdapter;
import com.FourFashionShop.fragment.CartFragment;

public class BeforeOrderActivity extends AppCompatActivity {
    private TextView txtContent;
    private RecyclerView recycler_product_order;
    private BeforeOrderAdapter beforeOrderAdapter;
    private Button btnBeforeOrder;
    private LinearLayout lnLocation;
    private RadioButton rdGiaoNhanh, rdGiaoHomSau, rdGiaoTC;
    private TextView txtShip;
    double shipGiaoNhanh = 60000;
    double shipHomSau = 30000;
    double shipGiaoTC = 20000;
    private int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_order);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Hình Thức Giao Hàng");

        txtContent = (TextView) findViewById(R.id.txtContent);
        txtContent.setText("Địa chỉ nhận hàng\nChọn địa chỉ");

        beforeOrderAdapter = new BeforeOrderAdapter(CartFragment.cartModels, this);

        recycler_product_order = findViewById(R.id.recycler_product_order);
        btnBeforeOrder = findViewById(R.id.btnBeforeOrder);
        lnLocation = findViewById(R.id.lnLocation);

        rdGiaoNhanh = findViewById(R.id.rdGiaoNhanh);
        rdGiaoHomSau = findViewById(R.id.rdGiaoHomSau);
        rdGiaoTC = findViewById(R.id.rdGiaoTC);
        txtShip = findViewById(R.id.txtShip);
        recycler_product_order.setAdapter(beforeOrderAdapter);
        recycler_product_order.setLayoutManager(new LinearLayoutManager(this));


        //Địa điểm
        lnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locate = new Intent(getApplication(), LocationUserActivity.class);
                startActivity(locate);
            }
        });



        btnBeforeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //phí ship
                if (rdGiaoNhanh.isChecked() == true) {
                    txtShip.setText(String.valueOf(shipGiaoNhanh));
                    flag = 0;
                }
                else
                if (rdGiaoHomSau.isChecked() == true){
                    txtShip.setText(String.valueOf(shipHomSau));
                    flag = 0;
                }
                else
                if (rdGiaoTC.isChecked() == true){
                    txtShip.setText(String.valueOf(shipGiaoTC));
                    flag = 0;
                } else{
                    flag = 1;
                }

                if (flag == 1) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Bạn cần chọn hình thức giao hàng!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else {
                    Intent ordered = new Intent(getApplication(), OrderInfoActivity.class);
                    startActivity(ordered);
                }

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
