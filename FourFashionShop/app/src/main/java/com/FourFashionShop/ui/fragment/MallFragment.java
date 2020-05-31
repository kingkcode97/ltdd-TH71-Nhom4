package com.FourFashionShop.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.FourFashionShop.R;
import com.FourFashionShop.ui.mall_Item_Fragment.Mall_Item1;
import com.FourFashionShop.ui.mall_Item_Fragment.Mall_Item2;
import com.FourFashionShop.ui.mall_Item_Fragment.Mall_Item3;
import com.FourFashionShop.ui.mall_Item_Fragment.Mall_Item4;
import com.FourFashionShop.ui.mall_Item_Fragment.Mall_Item5;
import com.google.android.material.tabs.TabLayout;

import com.FourFashionShop.ui.adapter.ViewPagerAdapter;

public class MallFragment extends Fragment {
    private View view;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    public MallFragment() {
        // Required empty public constructor
    }


    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void setUpViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), 0);

        viewPagerAdapter.addFragment(new Mall_Item1(), "Item 1");
        viewPagerAdapter.addFragment(new Mall_Item2(), "Item 2");
        viewPagerAdapter.addFragment(new Mall_Item3(), "Item 3");
        viewPagerAdapter.addFragment(new Mall_Item4(), "Item 4");
        viewPagerAdapter.addFragment(new Mall_Item5(), "Item 5");

        viewPager.setAdapter(viewPagerAdapter);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mall, container, false);
        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager = view.findViewById(R.id.viewPager);
        return view;
    }

}
