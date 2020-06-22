package com.FourFashionShop.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.FourFashionShop.Models.CouponModel;
import com.FourFashionShop.R;

import java.util.List;

public class CouponAdapter extends RecyclerView.Adapter<CouponAdapter.MyViewHolder> {
    private List<CouponModel> couponModelList;
    private Context context;

    public CouponAdapter(List<CouponModel> couponModelList, Context context) {
        this.couponModelList = couponModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.coupon_list_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(couponModelList.get(position).getImage());
        holder.txtCouponTitle.setText(couponModelList.get(position).getCouponTitle());
        holder.txtCouponDescription.setText(couponModelList.get(position).getCouponDescription());
        holder.txtCouponRule.setText(couponModelList.get(position).getCouponRule());
        holder.txtDateFrom.setText(couponModelList.get(position).getDateFrom());
        holder.txtDateTo.setText(couponModelList.get(position).getDateTo());
    }

    @Override
    public int getItemCount() {
        return couponModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtCouponTitle, txtCouponDescription, txtCouponRule, txtDateFrom, txtDateTo;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtCouponTitle=itemView.findViewById(R.id.couponTitle);
            txtCouponDescription=itemView.findViewById(R.id.couponDescription);
            txtCouponRule=itemView.findViewById(R.id.couponRule);
            txtDateFrom=itemView.findViewById(R.id.datefrom);
            txtDateTo=itemView.findViewById(R.id.dateto);
            imageView=itemView.findViewById(R.id.couponImage);
        }
    }
}
