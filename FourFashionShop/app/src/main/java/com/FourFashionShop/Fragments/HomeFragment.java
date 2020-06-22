package com.FourFashionShop.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.FourFashionShop.Activities.CategoryActivity;
import com.FourFashionShop.Adapters.CategoryAdapter;
import com.FourFashionShop.Adapters.GridProductLayoutAdapter;
import com.FourFashionShop.Adapters.HomePageAdapter;
import com.FourFashionShop.Adapters.HorizontalProductScrollAdapter;
import com.FourFashionShop.Adapters.SliderAdapter;
import com.FourFashionShop.Models.CategoryModel;
import com.FourFashionShop.Models.HomePageModel;
import com.FourFashionShop.Models.HorizontalProductScrollModel;
import com.FourFashionShop.Models.SliderModel;
import com.FourFashionShop.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {
    public HomeFragment(){

    }

    ///////////Category
    private RecyclerView categoryRecycleView;
    private ImageView categoryIcon;
    private TextView categoryName;
    ////////////Category

    /////////////Banner Slider
    private ViewPager bannerSliderViewPaper;
    private List<SliderModel> sliderModelList;
    private int currentPage = 2;
    private Timer timer;
    final private long DELAY_TIME = 3000;
    final private long PERIOD_TIME = 3000;
    /////////////Banner Slider

    //////////////Horizontal Product Layout
    private TextView horizontalLayoutTitle;
    private Button horizontalLayoutViewAllBtn;
    private RecyclerView horizontalRecycleView;
    //////////////Horizontal Product Layout

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ////////////////Category
        categoryRecycleView = view.findViewById(R.id.category_recyclerView);
        categoryIcon = view.findViewById(R.id.category_icon);
        categoryName = view.findViewById(R.id.category_name);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecycleView.setLayoutManager(layoutManager);

        List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel(R.drawable.skirt, "Skirt"));
        categoryModelList.add(new CategoryModel(R.drawable.beachwear, "Beachwear"));
        categoryModelList.add(new CategoryModel(R.drawable.bodysuit, "Bodysuit"));
        categoryModelList.add(new CategoryModel(R.drawable.denim, "Denim"));
        categoryModelList.add(new CategoryModel(R.drawable.fashionset, "Fashion set"));
        categoryModelList.add(new CategoryModel(R.drawable.jacket, "Jacket"));
        categoryModelList.add(new CategoryModel(R.drawable.jumpsuit, "Jumpsuit"));
        categoryModelList.add(new CategoryModel(R.drawable.lingerie, "Lingerie"));
        categoryModelList.add(new CategoryModel(R.drawable.shirt, "Shirt"));
        categoryModelList.add(new CategoryModel(R.drawable.tshirt, "T-shirt"));
        categoryModelList.add(new CategoryModel(R.drawable.sweater, "Sweater"));

        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecycleView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

        ///////////////Category

        /////////////////Banner Slider
        bannerSliderViewPaper = view.findViewById(R.id.banner_slider_view_paper);

        sliderModelList = new ArrayList<>();
        sliderModelList.add(new SliderModel(R.drawable.baner1));
        sliderModelList.add(new SliderModel(R.drawable.baner2));
        sliderModelList.add(new SliderModel(R.drawable.baner3));
        sliderModelList.add(new SliderModel(R.drawable.baner4));
        sliderModelList.add(new SliderModel(R.drawable.baner5));
        sliderModelList.add(new SliderModel(R.drawable.banner));

        SliderAdapter sliderAdapter = new SliderAdapter(sliderModelList);
        bannerSliderViewPaper.setAdapter(sliderAdapter);
        bannerSliderViewPaper.setClipToPadding(false);
        bannerSliderViewPaper.setPageMargin(20);

        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentPage = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if (state == ViewPager.SCROLL_STATE_IDLE){
                    pageLooper();
                }
            }
        };
        bannerSliderViewPaper.addOnPageChangeListener(onPageChangeListener);

        startbannerSlideShow();
        bannerSliderViewPaper.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                pageLooper();
                stopbannerSlideShow();
                if (event.getAction() == MotionEvent.ACTION_UP)
                    startbannerSlideShow();
                return false;
            }
        });
        ////////////Banner Slider

        ////////////Horizontal Product Layout
        horizontalLayoutTitle = view.findViewById(R.id.horizontal_scroll_layout_title);
        horizontalLayoutViewAllBtn = view.findViewById(R.id.horizontal_scroll_view_all_btn);
        horizontalRecycleView = view.findViewById(R.id.horizontal_scroll_layout_recyclerview);

        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man, "Man 1", "Man 1 qua dep", "100000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man1, "Man 2", "Man 2 qua dep", "200000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man2, "Man 3", "Man 3 qua dep", "300000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man3, "Man 4", "Man 4 qua dep", "400000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man4, "Man 5", "Man 5 qua dep", "500000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.man5, "Man 6", "Man 6 qua dep", "600000"));

        HorizontalProductScrollAdapter horizontalProductScrollAdapter = new HorizontalProductScrollAdapter(horizontalProductScrollModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        horizontalRecycleView.setLayoutManager(linearLayoutManager);

        horizontalRecycleView.setAdapter(horizontalProductScrollAdapter);
        horizontalProductScrollAdapter.notifyDataSetChanged();
        //////////////Horizontal Product Layout

        //////////////Grid Product Layout
        TextView gridLayoutTitle = view.findViewById(R.id.grid_product_layout_title);
        Button gridLayoutViewAllBtn = view.findViewById(R.id.grid_product_layout_viewAll);
        GridView gridView = view.findViewById(R.id.grid_product_layout_gridview);

        gridView.setAdapter(new GridProductLayoutAdapter(horizontalProductScrollModelList));
        //////////////Grid Product Layout

        //////////////
//        RecyclerView testing = view.findViewById(R.id.testing);
//        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(getContext());
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        testing.setLayoutManager(testingLayoutManager);
//
//        List<HomePageModel> homePageModelList = new ArrayList<>();
//        homePageModelList.add(new HomePageModel(0, sliderModelList));
//        homePageModelList.add(new HomePageModel(1, "Horizontal", horizontalProductScrollModelList));
//        homePageModelList.add(new HomePageModel(2, "Grid", horizontalProductScrollModelList));
//
//        HomePageAdapter homePageAdapter = new HomePageAdapter(homePageModelList);
//        testing.setAdapter(homePageAdapter);
//        homePageAdapter.notifyDataSetChanged();
        //////////////

        return view;
    }

    private void pageLooper(){
        if (currentPage == sliderModelList.size() - 2){
            currentPage = 2;
            bannerSliderViewPaper.setCurrentItem(currentPage, false);
        }
        if (currentPage == 1){
            currentPage = sliderModelList.size() - 3;
            bannerSliderViewPaper.setCurrentItem(currentPage, false);
        }
    }
    private void startbannerSlideShow(){
        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            @Override
            public void run() {
                if(currentPage >= sliderModelList.size()){
                    currentPage = 1;
                }
                bannerSliderViewPaper.setCurrentItem(currentPage++, true);
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        }, DELAY_TIME, PERIOD_TIME);
    }
    private void stopbannerSlideShow(){
        timer.cancel();
    }
}
