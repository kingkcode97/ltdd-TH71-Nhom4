package com.FourFashionShop.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
<<<<<<< HEAD
=======
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
>>>>>>> phuoc
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

<<<<<<< HEAD
import com.FourFashionShop.Adapters.ViewPagerAdapter;
import com.FourFashionShop.Fragments.Mall_Item_Fragment.Mall_Item1;
import com.FourFashionShop.R;
import com.FourFashionShop.Fragments.Mall_Item_Fragment.Mall_Item2;
import com.FourFashionShop.Fragments.Mall_Item_Fragment.Mall_Item3;
import com.FourFashionShop.Fragments.Mall_Item_Fragment.Mall_Item4;
import com.FourFashionShop.Fragments.Mall_Item_Fragment.Mall_Item5;
import com.google.android.material.tabs.TabLayout;

=======
import com.FourFashionShop.R;
import com.FourFashionShop.Fragments.mall_Item_Fragment.MallItem1;
import com.FourFashionShop.Fragments.mall_Item_Fragment.Mall_Item2;
import com.FourFashionShop.Fragments.mall_Item_Fragment.Mall_Item3;
import com.FourFashionShop.Fragments.mall_Item_Fragment.Mall_Item4;
import com.FourFashionShop.Fragments.mall_Item_Fragment.Mall_Item5;
import com.google.android.material.tabs.TabLayout;

import com.FourFashionShop.Adapters.ViewPagerAdapter;

>>>>>>> phuoc
public class MallFragment extends Fragment {
    private View view;
    private ViewPager viewPager;
    private TabLayout tabLayout;

<<<<<<< HEAD
=======
    Toolbar toolbar;


>>>>>>> phuoc
    public MallFragment() {
        // Required empty public constructor
    }


    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
<<<<<<< HEAD
=======
        toolbar = view.findViewById(R.id.toolbar);
        setToolbar(toolbar);
>>>>>>> phuoc

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

<<<<<<< HEAD
        viewPagerAdapter.addFragment(new Mall_Item1(), "Item 1");
=======
        viewPagerAdapter.addFragment(new MallItem1(), "Item 1");
>>>>>>> phuoc
        viewPagerAdapter.addFragment(new Mall_Item2(), "Item 2");
        viewPagerAdapter.addFragment(new Mall_Item3(), "Item 3");
        viewPagerAdapter.addFragment(new Mall_Item4(), "Item 4");
        viewPagerAdapter.addFragment(new Mall_Item5(), "Item 5");
<<<<<<< HEAD

        viewPager.setAdapter(viewPagerAdapter);
    }

=======
        viewPager.setAdapter(viewPagerAdapter);
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }
>>>>>>> phuoc

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
<<<<<<< HEAD
=======
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setTitle("Mlem");
>>>>>>> phuoc
        view = inflater.inflate(R.layout.fragment_mall, container, false);
        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager = view.findViewById(R.id.viewPager);
        return view;
    }

<<<<<<< HEAD
=======

>>>>>>> phuoc
}
