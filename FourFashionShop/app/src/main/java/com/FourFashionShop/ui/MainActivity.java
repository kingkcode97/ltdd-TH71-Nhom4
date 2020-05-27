package com.FourFashionShop.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.FourFashionShop.R;
import com.FourFashionShop.ui.Fragment.AccountFragment;
import com.FourFashionShop.ui.Fragment.CartFragment;
import com.FourFashionShop.ui.Fragment.HomeFragment;
import com.FourFashionShop.ui.Fragment.MallFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private static final String TAG = "MainActivity";

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        //frameLayout = findViewById(R.id.container);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

    }

    HomeFragment homeFragment       = new HomeFragment();
    MallFragment mallFragment       = new MallFragment();
    CartFragment cartFragment       = new CartFragment();
    AccountFragment accountFragment = new AccountFragment();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                        .replace(R.id.container, homeFragment).commit();
                return true;
            case R.id.navigation_mall:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                        .replace(R.id.container, mallFragment).commit();
                return true;
            case R.id.navigation_cart:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                        .replace(R.id.container, cartFragment).commit();
                return true;
            case R.id.navigation_account:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                        .replace(R.id.container, accountFragment).commit();
                return true;
        }
        return false;
    }
}
