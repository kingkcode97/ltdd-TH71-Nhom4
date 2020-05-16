package com.example.fashionshop.adapters;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.fashionshop.R;
import com.example.fashionshop.dialogs.MyProgressDialog;
import com.example.fashionshop.models.SubCategory;
import com.example.fashionshop.ui.ProductListActivity;
import com.example.fashionshop.utils.MySingleton;

import java.util.Collections;
import java.util.List;
public class TabbedRecyclerAdapter extends RecyclerView.Adapter<TabbedRecyclerAdapter.MyViewHolder> {

    Context mContext;
    List<SubCategory> data = Collections.emptyList();
    MyProgressDialog myProgressDialog;
    private LayoutInflater inflater;
    private ImageLoader mImageLoader;
    private int category_id;

    public TabbedRecyclerAdapter(Context context, List<SubCategory> data, int category_id, MyProgressDialog myProgressDialog) {
        inflater = LayoutInflater.from(context);
        this.mContext = context;
        this.data = data;
        this.category_id = category_id;
        this.myProgressDialog = myProgressDialog;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.cards, parent, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name = (TextView) v.findViewById(R.id.text_card_name);
                TextView subCatId = (TextView) v.findViewById(R.id.idView);

//                Toast.makeText(mContext,"Card Clicked ->" + name.getText() + " | Category ->"
//                        + category_id + " | SubCategoryId -> " + subCatId.getText() , Toast.LENGTH_SHORT).show();

                int subcatId = Integer.valueOf(subCatId.getText().toString());
                Intent intent = new Intent(mContext, ProductListActivity.class);
                intent.putExtra("subCatId", subcatId);
                intent.putExtra("categoryId", category_id);
                intent.putExtra("title", name.getText());
                MyProgressDialog.show(mContext, myProgressDialog, "", "");
                mContext.startActivity(intent);

            }
        });

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        SubCategory current = data.get(position);

        mImageLoader = MySingleton.getInstance(mContext).getImageLoader();
        holder.text_card_name.setText(current.sub_category_name);
        holder.image_card_cover.setImageUrl(current.image_url, mImageLoader);
        holder.text_desc.setText(current.sub_category_desc);
        holder.text_id.setText((String.valueOf(current.sub_category_id)));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        NetworkImageView image_card_cover;
        TextView text_card_name;
        TextView text_desc;
        TextView text_id;

        public MyViewHolder(View itemView) {
            super(itemView);

            image_card_cover = (NetworkImageView) itemView.findViewById(R.id.image_card_cover);
            text_card_name = (TextView) itemView.findViewById(R.id.text_card_name);
            text_desc = (TextView) itemView.findViewById(R.id.text_desc);
            text_id = (TextView) itemView.findViewById(R.id.idView);
        }
    }
}