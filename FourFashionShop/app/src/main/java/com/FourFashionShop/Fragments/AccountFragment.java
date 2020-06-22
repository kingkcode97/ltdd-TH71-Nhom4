package com.FourFashionShop.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.FourFashionShop.Activities.AddressListActivity;
import com.FourFashionShop.Activities.CouponActivity;
import com.FourFashionShop.Activities.FavoriteProductActivity;
import com.FourFashionShop.Activities.LoginActivity;
import com.FourFashionShop.Activities.NotificationActivity;
import com.FourFashionShop.Activities.OrdersManagementActivity;
import com.FourFashionShop.Activities.SupportActivity;
import com.FourFashionShop.Activities.UserInfoActivity;
import com.FourFashionShop.R;


public class AccountFragment extends Fragment {

    AppCompatImageView imgEdit;
    AppCompatTextView txtHelp, txtOrder, txtWishlist, txtAddress, txtNotification, txtOffer, txtLogout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);


        imgEdit = view.findViewById(R.id.imgEdit);
        txtHelp = view.findViewById(R.id.txtHelp);
        txtOrder = view.findViewById(R.id.txtOrder);
        txtWishlist = view.findViewById(R.id.txtWishlist);
        txtAddress = view.findViewById(R.id.txtAddress);
        txtNotification = view.findViewById(R.id.txtNotification);
        txtOffer = view.findViewById(R.id.txtOffer);
        txtLogout = view.findViewById(R.id.txtLogout);

        imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UserInfoActivity.class);
                startActivity(intent);
            }
        });

        txtHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SupportActivity.class);
                startActivity(intent);
            }
        });

        txtOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OrdersManagementActivity.class);
                startActivity(intent);
            }
        });

        txtWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FavoriteProductActivity.class);
                startActivity(intent);
            }
        });

        txtAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddressListActivity.class);
                startActivity(intent);
            }
        });

        txtNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NotificationActivity.class);
                startActivity(intent);
            }
        });

        txtOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CouponActivity.class);
                startActivity(intent);
            }
        });

        txtLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}