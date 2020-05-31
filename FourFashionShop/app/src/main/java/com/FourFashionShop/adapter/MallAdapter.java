package com.FourFashionShop.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.FourFashionShop.R;
import com.FourFashionShop.ui.Mall_Product_Activity;
import com.FourFashionShop.mall_Item_Fragment.Item;

import java.util.List;

public class MallAdapter extends RecyclerView.Adapter<MallAdapter.MyViewHolder> {

    Context mContext;
    List<Item> mData;

    public MallAdapter(Context mContext, List<Item> mData) {
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.text_Title.setText(mData.get(position).getTitle());
        holder.text_Price.setText(mData.get(position).getPrice());
        holder.imageView.setImageResource(mData.get(position).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Mall_Product_Activity.class);
                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Price", mData.get(position).getPrice());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());

                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text_Title;
        TextView text_Price;
        ImageView imageView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text_Title = (TextView) itemView.findViewById(R.id.text_Title);
            text_Price = (TextView) itemView.findViewById(R.id.text_Price);
            imageView = (ImageView) itemView.findViewById(R.id.imgItem);
            cardView = (CardView) itemView.findViewById(R.id.cardview_mall_id);
        }
    }



}





