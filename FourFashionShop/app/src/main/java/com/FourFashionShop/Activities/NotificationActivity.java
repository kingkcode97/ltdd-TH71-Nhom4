package com.FourFashionShop.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.FourFashionShop.Adapters.AddressListAdapter;
import com.FourFashionShop.Adapters.NotificationAdapter;
import com.FourFashionShop.Models.AddressListModal;
import com.FourFashionShop.Models.NotificationModel;
import com.FourFashionShop.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<NotificationModel> notificationModelList;
    private NotificationAdapter notificationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Thông báo");

        initItem();

        recyclerView = findViewById(R.id.recyclerViewNotification);
        notificationAdapter = new NotificationAdapter(notificationModelList, this);
        recyclerView.setAdapter(notificationAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initItem() {
        notificationModelList = new ArrayList<>();
        notificationModelList.add(new NotificationModel("Sale hè",
                "khuyến mãi",R.drawable.man2));
        notificationModelList.add(new NotificationModel("Sale tết",
                "khuyến mãi",R.drawable.man3));
        notificationModelList.add(new NotificationModel("Sale thu đông",
                "khuyến mãi",R.drawable.dress1));
        notificationModelList.add(new NotificationModel("Quốc tế Phụ nữ 8/3",
                "khuyến mãi",R.drawable.fashion1));
        notificationModelList.add(new NotificationModel("Sale giáng sinh",
                "khuyến mãi",R.drawable.man1));

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