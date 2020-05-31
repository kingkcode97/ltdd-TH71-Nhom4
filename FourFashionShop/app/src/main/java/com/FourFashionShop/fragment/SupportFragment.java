package com.FourFashionShop.fragment;

import androidx.fragment.app.Fragment;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.FourFashionShop.R;
import com.FourFashionShop.adapter.SupportAdapter;

import java.util.ArrayList;
import java.util.List;


public class SupportFragment extends Fragment {
    private View view;
    private RecyclerView recyclerView;
    List<String> stringList;
    SupportAdapter supportAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar =  ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setTitle("Hỗ trợ");

        stringList = new ArrayList<>();
        stringList.add("Giới thiệu về FashionShop");
        stringList.add("Gửi email hỗ trợ");
        stringList.add("Các câu hỏi thường gặp");
        stringList.add("Hướng dẫn đặt hàng");
        stringList.add("Chính sách đổi trả");
        stringList.add("Chính sách vận chuyển");
        stringList.add("Chính sách hàng nhập khẩu");
        stringList.add("Chính sách bảo mật thanh toán");
        stringList.add("Chính sách bảo mật thông tin");
        stringList.add("Chính sách bảo mặt ứng dụng");
        stringList.add("Chính sách giải quyết khiếu nại");
        stringList.add("Qui chế ứng dụng\n");
        stringList.add("Điều khoản sử dụng");

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_support, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewSupport);

        supportAdapter = new SupportAdapter(stringList, getContext());
        recyclerView.setAdapter(supportAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
