package com.FourFashionShop.Adapters;

import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.FourFashionShop.Activities.CategoryActivity;
import com.FourFashionShop.Models.CategoryModel;
import com.FourFashionShop.R;

import java.util.List;
import java.util.Locale;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<CategoryModel> categoryModelList;

    public CategoryAdapter(List<CategoryModel> categoryModelList) {
        this.categoryModelList = categoryModelList;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int icon = categoryModelList.get(position).getCategoryIconLink();
        String name = categoryModelList.get(position).getCategoryName();
        holder.setCategoryIcon(icon);
        holder.setCategory(name);
    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView categoryIcon;
        private TextView categoryName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryIcon = itemView.findViewById(R.id.category_icon);
            categoryName = itemView.findViewById(R.id.category_name);
        }

        private void setCategoryIcon(final int icon){
            categoryIcon.setImageResource(icon);
        }

        private void setCategory(final String name){
            categoryName.setText(name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent categoryIntent = new Intent(itemView.getContext(), CategoryActivity.class);
                    categoryIntent.putExtra("CategoryName", name);
                    itemView.getContext().startActivity(categoryIntent);
                }
            });
        }
    }

}
