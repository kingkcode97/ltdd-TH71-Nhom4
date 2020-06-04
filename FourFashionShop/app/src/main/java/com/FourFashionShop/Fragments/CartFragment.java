package com.FourFashionShop.Fragments;

<<<<<<< HEAD
=======
import android.app.Dialog;
import android.content.Intent;
>>>>>>> phuoc
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
=======
import android.widget.Button;
>>>>>>> phuoc
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.FourFashionShop.R;
<<<<<<< HEAD
import com.FourFashionShop.Models.CartModel;
import com.FourFashionShop.Adapters.CartAdapter;
=======
import com.FourFashionShop.ui.BeforeOrderActivity;
import com.FourFashionShop.Models.CartModel;
import com.FourFashionShop.ui.Adapter.CartAdapter;
>>>>>>> phuoc

import java.util.ArrayList;
import java.util.List;


public class CartFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;
<<<<<<< HEAD
    private List<CartModel> cartModels;
    private CartAdapter cartAdapter;
    private ImageButton imgBtnCloseCart, imgBtnAddPro, imgBtnRemovePro;
    public ActionBar actionBar;
    public TextView txtName, txtTotalPrice, txtSoLuong;
=======
    public static List<CartModel> cartModels;
    private CartAdapter cartAdapter;
    private ImageButton imgBtnCloseCart, imgBtnAddPro, imgBtnRemovePro;
    private ActionBar actionBar;
    public TextView txtName, txtTotalPrice, txtSoLuong;
    public Button btnOrder;

    //dialog
    private Dialog dialog;

>>>>>>> phuoc
    public CartFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actionBar =  ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);

        cartModels = new ArrayList<>();
        cartModels.add(new CartModel("Quần đùi", "200,000đ", R.drawable.tra, "2"));
        cartModels.add(new CartModel("Quần thun", "200,000đ", R.drawable.tra, "3"));
        cartModels.add(new CartModel("Quần tay", "200,000đ", R.drawable.tra, "4"));
        cartModels.add(new CartModel("Áo khoác", "200,000đ", R.drawable.tra, "5"));
        cartModels.add(new CartModel("Áo jean", "200,000đ", R.drawable.tra, "2"));
        cartModels.add(new CartModel("Áo sơ mi", "200,000đ", R.drawable.tra, "2"));

        actionBar.setTitle("Giỏ hàng(" + cartModels.size() + ")");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
<<<<<<< HEAD
        // Inflate the layout for this fragment
=======
        // Inflate the layout for this Fragments
>>>>>>> phuoc
        //return inflater.inflate(R.layout.fragment_cart, container, false);



        view = inflater.inflate(R.layout.fragment_cart, container, false);
        imgBtnAddPro = (ImageButton) view.findViewById(R.id.imgBtnAddPro);
        imgBtnRemovePro = (ImageButton) view.findViewById(R.id.imgBtnRemovePro);
        imgBtnCloseCart = (ImageButton) view.findViewById(R.id.imgBtnCloseCart);
        txtSoLuong = (TextView) view.findViewById(R.id.txtSoLuong);
        txtName = (TextView) view.findViewById(R.id.txtName);
        txtTotalPrice = (TextView) view.findViewById(R.id.txtTotalPrice);

        cartAdapter = new CartAdapter(cartModels, getContext());
        recyclerView = view.findViewById(R.id.recycler_product);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(cartAdapter);
<<<<<<< HEAD
=======

        btnOrder = (Button) view.findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ordered = new Intent(getActivity(), BeforeOrderActivity.class);
                startActivity(ordered);
            }
        });

>>>>>>> phuoc
        buildRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    public void removeItem(int position) {
        cartModels.remove(position);
        cartAdapter.notifyItemRemoved(position);
<<<<<<< HEAD
=======
        Toast toast = Toast.makeText(getContext(), "Bạn vừa xóa một sản phẩm!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
>>>>>>> phuoc
    }

    //bo
    public void changeItem(int position, String num) {
        cartModels.get(position).setTxtSoLuong(num);
        cartAdapter.notifyItemChanged(position);
    }

    public void addNumber(int position) {
        int num = Integer.valueOf(cartModels.get(position).getTxtSoLuong());
        num++;
<<<<<<< HEAD
        cartModels.get(position).setTxtSoLuong(String.valueOf(5));
=======
        cartModels.get(position).setTxtSoLuong(String.valueOf(num));
>>>>>>> phuoc
        cartAdapter.notifyItemChanged(position);
    }

    public void removeNumber(int position) {
        int num = Integer.valueOf(cartModels.get(position).getTxtSoLuong());
        num--;
        if (num == 0){
            removeItem(position);
            cartAdapter.notifyItemRemoved(position);
        }
        else{
            cartModels.get(position).setTxtSoLuong(String.valueOf(num));
            cartAdapter.notifyItemChanged(position);
        }

    }

    public void buildRecyclerView() {



        cartAdapter.setOnIteamClickListener(new CartAdapter.OnItemCartClickListener() {
            @Override
            public void onItemClick(int position) {

            }

            @Override
            public void onDeleteClick(int position) {
<<<<<<< HEAD
                removeItem(position);
                NoficationCart();
=======

                removeItem(position);
                NoficationCart();



>>>>>>> phuoc
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
        if (cartModels.size() == 0) {
            Toast toast = Toast.makeText(getContext(), "Giỏ hàng trống!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            actionBar.setTitle("Giỏ hàng(" + cartModels.size() + ")");
        }
        else {
            actionBar.setTitle("Giỏ hàng(" + cartModels.size() + ")");
        }
    }
<<<<<<< HEAD
=======

    //dialog

>>>>>>> phuoc
}
