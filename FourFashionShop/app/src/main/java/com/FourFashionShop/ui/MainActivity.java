package com.FourFashionShop.ui;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.FourFashionShop.R;
import com.FourFashionShop.fragment.AccountFragment;
import com.FourFashionShop.fragment.CartFragment;
import com.FourFashionShop.fragment.HomeFragment;
import com.FourFashionShop.fragment.MallFragment;
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
