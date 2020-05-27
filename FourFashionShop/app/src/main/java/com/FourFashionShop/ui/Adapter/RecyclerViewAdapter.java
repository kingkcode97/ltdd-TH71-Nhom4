package com.FourFashionShop.ui.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.FourFashionShop.R;
import com.FourFashionShop.ui.Mall_Item_Fragment.Item;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Item> mData;

    public RecyclerViewAdapter(Context mContext, List<Item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_mall, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text_Title1.setText(mData.get(position).getTitle1());
        holder.text_Title2.setText(mData.get(position).getTitle2());
        holder.imageView.setImageResource(mData.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text_Title1;
        TextView text_Title2;
        ImageView imageView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text_Title1 = (TextView) itemView.findViewById(R.id.text_Title1);
            text_Title2 = (TextView) itemView.findViewById(R.id.text_Title2);
            imageView = (ImageView) itemView.findViewById(R.id.imgItem);
        }
    }



}





