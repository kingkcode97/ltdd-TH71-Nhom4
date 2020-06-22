package com.FourFashionShop.Fragments;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.FourFashionShop.Models.CartItemModel;
import com.FourFashionShop.R;
import com.FourFashionShop.Activities.BeforeOrderActivity;
import com.FourFashionShop.Models.CartModel;
import com.FourFashionShop.Adapters.CartAdapter;

import java.util.ArrayList;
import java.util.List;


public class CartFragment extends Fragment {

    Button btnOrder;
    TextView txtTongTien;
    ActionBar actionBar;
    public static int tongTien = 0;
    public static List<CartItemModel> cartItemModelList;
    public static CartAdapter cartAdapter;
    private ImageView add_quantity, sub_quantity;

    public CartFragment() {
    }

    private RecyclerView cartItemsRecycleView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

//        actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
//        actionBar.setDisplayShowHomeEnabled(true);

        cartItemsRecycleView = view.findViewById(R.id.cart_items_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cartItemsRecycleView.setLayoutManager(layoutManager);

        cartItemModelList = new ArrayList<>();
        cartItemModelList.add(new CartItemModel(0, R.drawable.man1, "Man 1", 100000, "299999", 2));
        cartItemModelList.add(new CartItemModel(0, R.drawable.man2, "Man 2", 200000, "399999", 4));
        cartItemModelList.add(new CartItemModel(0, R.drawable.man3, "Man 3", 300000, "599999", 5));

        cartAdapter = new CartAdapter(cartItemModelList);
        cartItemsRecycleView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();

        btnOrder = view.findViewById(R.id.btnOrder);
        txtTongTien = view.findViewById(R.id.txtTongTien);
        add_quantity = view.findViewById(R.id.add_quantity);
        sub_quantity = view.findViewById(R.id.sub_quantity);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ordered = new Intent(getContext(), BeforeOrderActivity.class);
                startActivity(ordered);
            }
        });

        buildRecyclerView();

        return view;
    }

    public void TongTien() {
        for (int k = 0; k < cartItemModelList.size(); k++) {
            tongTien += cartItemModelList.get(k).getProductPrice() * cartItemModelList.get(k).getProductQuantity();
        }
        txtTongTien.setText(String.valueOf(tongTien));
    }

    public void addNumber(int position) {
        int num = Integer.valueOf(cartItemModelList.get(position).getProductQuantity());
        num++;
        cartItemModelList.get(position).setProductQuantity(num);
        cartAdapter.notifyItemChanged(position);
        TongTien();
    }

    public void removeNumber(int position) {
        int num = Integer.valueOf(cartItemModelList.get(position).getProductQuantity());
        num--;
        if (num == 0){
            removeItem(position);
            cartAdapter.notifyItemRemoved(position);
        }
        else{
            cartItemModelList.get(position).setProductQuantity(num);
            cartAdapter.notifyItemChanged(position);
        }
        TongTien();
    }

    private void removeItem(int position) {
        cartItemModelList.remove(position);
        cartAdapter.notifyDataSetChanged();
        Toast toast = Toast.makeText(getContext(), "Bạn vừa xóa 1 sản phẩm", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        TongTien();
    }

    public void buildRecyclerView() {
        cartAdapter.setmListener(new CartAdapter.OnItemCartClickListener() {
            @Override
            public void onItemClick(int position) {

            }

            @Override
            public void onDeleteClick(int position) {
                removeItem(position);
                NoficationCart();
            }

            @Override
            public void onAddNumberClick(int position) {
                addNumber(position);
            }

            @Override
            public void onRemoveNumberClick(int position) {
                removeNumber(position);
                NoficationCart();
            }
        });
    }

    public void NoficationCart() {
        ActionBar actionBar = null;
        if (cartItemModelList.size() == 0) {
            Toast toast = Toast.makeText(getContext(), "Giỏ hàng trống!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getContext(), "Giỏ hàng(" + cartItemModelList.size() + ")", Toast.LENGTH_LONG);
//            actionBar.setTitle("Giỏ hàng(" + cartItemModelList.size() + ")");
        }
    }
}
