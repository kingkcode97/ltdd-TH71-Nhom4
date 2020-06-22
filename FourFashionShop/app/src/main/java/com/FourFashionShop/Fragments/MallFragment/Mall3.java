package com.FourFashionShop.Fragments.MallFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.FourFashionShop.Adapters.HorizontalProductScrollAdapter;
import com.FourFashionShop.Models.HorizontalProductScrollModel;
import com.FourFashionShop.R;

import java.util.ArrayList;
import java.util.List;

public class Mall3 extends Fragment {
    private View view;
    private RecyclerView recyclerView;
    private List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();


    public Mall3() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mall1, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_item1);

        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bs1, "Đồ đẹp", "Đồ quá đẹp", "290990"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bw2, "Đồ nữ", "Đồ quá đẹp", "300000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bs3, "Set nữ đẹp", "Đồ quá đẹp", "400000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bw1, "Áo khoác nâu", "Đồ quá đẹp", "100000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bs5, "Váy đẹp", "Đồ quá đẹp", "240000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bs6, "Đầm trắng", "Đồ quá đẹp", "100000"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.bw1, "Áo xanh", "Đồ quá đẹp", "220000"));

        HorizontalProductScrollAdapter adapter = new HorizontalProductScrollAdapter(horizontalProductScrollModelList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
