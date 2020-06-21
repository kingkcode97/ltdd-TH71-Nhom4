package com.FourFashionShop.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.FourFashionShop.Adapters.ProductImageAdapter;
import com.FourFashionShop.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsActivity extends AppCompatActivity {

    private ViewPager productImagesViewPaper;
    private TabLayout viewpaperIndicator;
    private static boolean ALREADY_ADDED_TO_WISHLIST = false;
    private FloatingActionButton addtoWishList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        productImagesViewPaper = findViewById(R.id.product_image_viewpaper);
        viewpaperIndicator = findViewById(R.id.view_paper_indicator);
        addtoWishList = findViewById(R.id.addtoWishList);

        List<Integer> productImages = new ArrayList<>();
        productImages.add(R.drawable.man1);
        productImages.add(R.drawable.man2);
        productImages.add(R.drawable.man3);
        productImages.add(R.drawable.man4);

        ProductImageAdapter productImageAdapter = new ProductImageAdapter(productImages);
        productImagesViewPaper.setAdapter(productImageAdapter);

        viewpaperIndicator.setupWithViewPager(productImagesViewPaper, true);

        addtoWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ALREADY_ADDED_TO_WISHLIST){
                    ALREADY_ADDED_TO_WISHLIST = false;
                    addtoWishList.setSupportBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#9e9e9e")));
                }else{
                    ALREADY_ADDED_TO_WISHLIST = true;
                    addtoWishList.setSupportBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));
                }
            }
        });
    }
}