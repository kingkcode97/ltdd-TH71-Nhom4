package com.FourFashionShop.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.FourFashionShop.Models.OrderModel;
import com.FourFashionShop.R;

import java.util.List;

public class OrdersManagementAdapter extends RecyclerView.Adapter<OrdersManagementAdapter.MyViewHolder> {
    private List<OrderModel> orderModelList;
    private Context context;

    public OrdersManagementAdapter(List<OrderModel> orderModelList, Context context) {
        this.orderModelList = orderModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.order_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(orderModelList.get(position).getImage());
        holder.txtProductName.setText(orderModelList.get(position).getProductName());
        holder.txtOrderId.setText(orderModelList.get(position).getOrderId());
        holder.txtOrderDate.setText(orderModelList.get(position).getOrderDate());

    }

    @Override
    public int getItemCount() {
        return orderModelList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtProductName, txtOrderId, txtOrderDate;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtProductName=itemView.findViewById(R.id.card_item_name);
            txtOrderId=itemView.findViewById(R.id.card_item_order_id);
            txtOrderDate=itemView.findViewById(R.id.card_item_order_date);
            imageView=itemView.findViewById(R.id.card_item_img);
        }
    }
}
