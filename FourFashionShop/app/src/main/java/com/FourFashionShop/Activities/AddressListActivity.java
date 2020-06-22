package com.FourFashionShop.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.FourFashionShop.Adapters.AddressListAdapter;
import com.FourFashionShop.Adapters.OrdersManagementAdapter;
import com.FourFashionShop.Models.AddressListModal;
import com.FourFashionShop.Models.OrderModel;
import com.FourFashionShop.R;

import java.util.ArrayList;
import java.util.List;

public class AddressListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<AddressListModal> addressListModalList;
    private AddressListAdapter addressListAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_list);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Sổ địa chỉ");

        initItem();

        recyclerView = findViewById(R.id.recyclerViewAddressList);
        addressListAdapter = new AddressListAdapter(addressListModalList, this);
        recyclerView.setAdapter(addressListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initItem() {
        addressListModalList = new ArrayList<>();
        addressListModalList.add(new AddressListModal("Nguyen Duy Nam",
                "kingcode@gmail.com", "371 nguyen kiem",R.drawable.user));
        addressListModalList.add(new AddressListModal("Nguyen Duy Nam",
                "kingcode@gmail.com", "371 nguyen kiem, P4, Quận Gò Vấp, Tp.Hcm",R.drawable.man1));
        addressListModalList.add(new AddressListModal("Nguyen Duy Nam",
                "kingcode@gmail.com", "371 nguyen kiem",R.drawable.avatar1));
        addressListModalList.add(new AddressListModal("Nguyen Duy Nam",
                "kingcode@gmail.com", "371 nguyen kiem",R.drawable.avatar2));
        addressListModalList.add(new AddressListModal("Nguyen Duy Nam",
                "kingcode@gmail.com", "371 nguyen kiem",R.drawable.avatar3));
        addressListModalList.add(new AddressListModal("Nguyen Duy Nam",
                "kingcode@gmail.com", "371 nguyen kiem",R.drawable.avatar4));

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