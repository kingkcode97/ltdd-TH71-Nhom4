package com.FourFashionShop.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.FourFashionShop.Models.NotificationModel;
import com.FourFashionShop.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyViewHolder> {
    private List<NotificationModel> notificationModelList;
    private Context context;

    public NotificationAdapter(List<NotificationModel> notificationModelList, Context context) {
        this.notificationModelList = notificationModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.notification_list_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//         notificationModelList.get(position).getImage();
//        notificationModelList.get(position).getNotificationTitle();
//        notificationModelList.get(position).getNotificationDescription();

        holder.imageView.setImageResource(notificationModelList.get(position).getImage());
        holder.txtNotificationTitle.setText(notificationModelList.get(position).getNotificationTitle());
        holder.txtNotificationDescriptioin.setText(notificationModelList.get(position).getNotificationDescription());
    }

    @Override
    public int getItemCount() {
        return notificationModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtNotificationTitle, txtNotificationDescriptioin;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNotificationTitle=itemView.findViewById(R.id.notification_title);
            txtNotificationDescriptioin=itemView.findViewById(R.id.notification_description);
            imageView=itemView.findViewById(R.id.notification_img);
        }
    }
}
