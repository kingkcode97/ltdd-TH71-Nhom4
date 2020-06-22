package com.FourFashionShop.Fragments.MallFragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.FourFashionShop.R;
import com.FourFashionShop.Fragments.MallFragment.Mall1;
//import com.FourFashionShop.Fragments.MallFragment.Mall2;
//import com.FourFashionShop.Fragments.MallFragment.Mall3;
//import com.FourFashionShop.Fragments.MallFragment.Mall4;
//import com.FourFashionShop.Fragments.MallFragment.Mall5;
//import com.FourFashionShop.Fragments.MallFragment.Mall6;
//import com.FourFashionShop.Fragments.MallFragment.Mall7;
//import com.FourFashionShop.Fragments.MallFragment.Mall8;
//import com.FourFashionShop.Fragments.MallFragment.Mall9;
//import com.FourFashionShop.Fragments.MallFragment.Mall10;
import com.google.android.material.tabs.TabLayout;

import com.FourFashionShop.Adapters.ViewPagerAdapter;

public class MallFragment extends Fragment{

    private View view;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    Toolbar toolbar;


    public MallFragment() {
        // Required empty public constructor
    }


    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        toolbar = view.findViewById(R.id.toolbar);
        setToolbar(toolbar);

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

        viewPagerAdapter.addFragment(new Mall1(), "Denim");
        viewPagerAdapter.addFragment(new Mall2(), "Skirt");
        viewPagerAdapter.addFragment(new Mall3(), "Jacket");
        viewPagerAdapter.addFragment(new Mall4(), "Beachwear");
        viewPagerAdapter.addFragment(new Mall5(), "Bodysuit");
        viewPagerAdapter.addFragment(new Mall6(), "Fashion set");
        viewPagerAdapter.addFragment(new Mall7(), "Jumpsuit");
        viewPagerAdapter.addFragment(new Mall8(), "Lingerie");
        viewPagerAdapter.addFragment(new Mall9(), "Shirt");
        viewPagerAdapter.addFragment(new Mall10(), "T-Shirt");
        viewPager.setAdapter(viewPagerAdapter);
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setTitle("Mua Sắm");
        view = inflater.inflate(R.layout.fragment_mall, container, false);
        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager = view.findViewById(R.id.viewPager);
        return view;
    }

}
