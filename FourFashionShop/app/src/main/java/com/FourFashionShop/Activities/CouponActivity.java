package com.FourFashionShop.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.FourFashionShop.Adapters.CouponAdapter;
import com.FourFashionShop.Adapters.NotificationAdapter;
import com.FourFashionShop.Models.CouponModel;
import com.FourFashionShop.Models.NotificationModel;
import com.FourFashionShop.R;

import java.util.ArrayList;
import java.util.List;

public class CouponActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<CouponModel> couponModelList;
    private CouponAdapter couponAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Phiếu quà tặng");

        initItem();

        recyclerView = findViewById(R.id.recyclerViewCoupon);
        couponAdapter = new CouponAdapter(couponModelList, this);
        recyclerView.setAdapter(couponAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initItem() {
        couponModelList = new ArrayList<>();
        couponModelList.add(new CouponModel("Giảm 20.000 VNĐ!",
                "Áp dụng khi mua tối thiểu: 100.000 VNĐ",
                "Chỉ áp dụng khi thanh toán online", "22-06-2020",
                "22-08-2020", R.drawable.man1));
        couponModelList.add(new CouponModel("Giảm 100.000 VNĐ!",
                "Áp dụng khi mua tối thiểu: 500.000 VNĐ",
                "Chỉ áp dụng khi thanh toán online", "22-06-2020",
                "22-08-2020", R.drawable.man2));
        couponModelList.add(new CouponModel("Giảm 500.000 VNĐ!",
                "Áp dụng khi mua tối thiểu: 100.000 VNĐ",
                "Chỉ áp dụng khi thanh toán online", "22-06-2020",
                "22-08-2020", R.drawable.man3));
        couponModelList.add(new CouponModel("Giảm 200.000 VNĐ!",
                "Áp dụng khi mua tối thiểu: 100.000 VNĐ",
                "Chỉ áp dụng khi thanh toán online", "22-06-2020",
                "22-08-2020", R.drawable.man4));
        couponModelList.add(new CouponModel("Giảm 50.000 VNĐ!",
                "Áp dụng khi mua tối thiểu: 100.000 VNĐ",
                "Chỉ áp dụng khi thanh toán online", "22-06-2020",
                "22-08-2020", R.drawable.man5));

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