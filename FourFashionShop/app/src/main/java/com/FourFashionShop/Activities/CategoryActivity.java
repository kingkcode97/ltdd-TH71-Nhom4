package com.FourFashionShop.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.FourFashionShop.Adapters.CategoryAdapter;
//import com.FourFashionShop.Adapters.GridProductLayoutAdapter;
import com.FourFashionShop.Adapters.HorizontalProductScrollAdapter;
import com.FourFashionShop.Adapters.SliderAdapter;
import com.FourFashionShop.Models.CategoryModel;
import com.FourFashionShop.Models.HorizontalProductScrollModel;
import com.FourFashionShop.Models.SliderModel;
import com.FourFashionShop.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView categoryRecycleview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_category);
//        setSupportActionBar(toolbar);
//
//        String title = getIntent().getStringExtra("CategoryName");
//        getSupportActionBar().setTitle(title);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        categoryRecycleview = findViewById(R.id.category_recyclerview);

        /////////////////Banner Slider
        List<SliderModel> sliderModelList = new ArrayList<>();

        sliderModelList.add(new SliderModel(R.drawable.baner1));
        sliderModelList.add(new SliderModel(R.drawable.baner2));
        sliderModelList.add(new SliderModel(R.drawable.baner3));
        sliderModelList.add(new SliderModel(R.drawable.baner4));
        sliderModelList.add(new SliderModel(R.drawable.baner5));
        sliderModelList.add(new SliderModel(R.drawable.banner));
        ////////////Banner Slider

        ////////////Horizontal Product Layout
        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man, "Man 1", "Man 1 qua dep", "100000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man1, "Man 2", "Man 2 qua dep", "200000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man2, "Man 3", "Man 3 qua dep", "300000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man3, "Man 4", "Man 4 qua dep", "400000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man4, "Man 5", "Man 5 qua dep", "500000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man5, "Man 6", "Man 6 qua dep", "600000"));

        HorizontalProductScrollAdapter horizontalProductScrollAdapter = new HorizontalProductScrollAdapter(horizontalProductScrollModelList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecycleview.setLayoutManager(linearLayoutManager);
        //////////////Horizontal Product Layout

        //////////////Grid Product Layout
        //////////////Grid Product Layout
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.main_search_icon){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}