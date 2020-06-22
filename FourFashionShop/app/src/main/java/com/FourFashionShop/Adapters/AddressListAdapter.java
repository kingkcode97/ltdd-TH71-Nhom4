package com.FourFashionShop.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.FourFashionShop.Models.AddressListModal;
import com.FourFashionShop.Models.NotificationModel;
import com.FourFashionShop.R;

import java.util.List;

public class AddressListAdapter extends RecyclerView.Adapter<AddressListAdapter.MyViewHolder> {
    private List<AddressListModal> AddressModelList;
    private Context context;

    public AddressListAdapter(List<AddressListModal> AddressModelList, Context context) {
        this.AddressModelList = AddressModelList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.address_list_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AddressModelList.get(position).getImage();
        AddressModelList.get(position).getCustomerName();
        AddressModelList.get(position).getCustomerEmail();
        AddressModelList.get(position).getCustomerAddress();
    }

    @Override
    public int getItemCount() {
        return AddressModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtCustomerName, txtCustomerEmail, txtCustomerAddress;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtCustomerName=itemView.findViewById(R.id.customerName);
            txtCustomerEmail=itemView.findViewById(R.id.customerEmail);
            txtCustomerAddress=itemView.findViewById(R.id.customerAddress);
            imageView=itemView.findViewById(R.id.customerImage);
        }
    }
}
