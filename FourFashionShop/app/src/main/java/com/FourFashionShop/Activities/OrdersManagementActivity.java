package com.FourFashionShop.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.FourFashionShop.Models.OrderModel;
import com.FourFashionShop.R;
import com.FourFashionShop.Adapters.OrdersManagementAdapter;

import java.util.ArrayList;
import java.util.List;

public class OrdersManagementActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<OrderModel> orderModelList;
    private OrdersManagementAdapter ordersManagementAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_management);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Quản lí đơn hàng");

        initItem();

        recyclerView = findViewById(R.id.recyclerViewOrdersManagement);
        ordersManagementAdapter = new OrdersManagementAdapter(orderModelList, this);
        recyclerView.setAdapter(ordersManagementAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    void initItem(){
        orderModelList = new ArrayList<>();
            orderModelList.add(new OrderModel("Áo sơ mi nam","123456", "12/4/2020",R.drawable.man1));
            orderModelList.add(new OrderModel("Đầm nữ","23874", "24/5/2020",R.drawable.fashion1));
            orderModelList.add(new OrderModel("Váy nữ","21841", "12/6/2020",R.drawable.dress1));
            orderModelList.add(new OrderModel("Áo thun nam","12491", "12/5/2020",R.drawable.man2));
            orderModelList.add(new OrderModel("Áo sơ mi xanh","2341", "11/6/2020",R.drawable.man4));

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
