package com.FourFashionShop.ui.Mall_Item_Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.FourFashionShop.R;
import com.FourFashionShop.ui.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class Mall_Item1 extends Fragment {
    private View view;
    private RecyclerView recyclerView;
    private List<Item> items;

    public Mall_Item1() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mall__item1, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_item1);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), items);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items = new ArrayList<>();
        items.add(new Item("Title1", "Title2", "category", "des", R.drawable.item1));
        items.add(new Item("Title1", "Title2", "category", "des", R.drawable.item1));
        items.add(new Item("Title1", "Title2", "category", "des", R.drawable.item1));
        items.add(new Item("Title1", "Title2", "category", "des", R.drawable.item1));
        items.add(new Item("Title1", "Title2", "category", "des", R.drawable.item1));
        items.add(new Item("Title1", "Title2", "category", "des", R.drawable.item1));
        items.add(new Item("Title1", "Title2", "category", "des", R.drawable.item1));

    }
}