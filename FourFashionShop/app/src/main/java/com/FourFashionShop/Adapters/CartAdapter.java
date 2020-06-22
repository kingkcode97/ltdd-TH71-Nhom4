package com.FourFashionShop.Adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.FourFashionShop.Models.CartItemModel;
import com.FourFashionShop.R;
import com.FourFashionShop.Models.CartModel;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter {

    private List<CartItemModel> cartItemModelList;

    public CartAdapter(List<CartItemModel> cartItemModelList) {
        this.cartItemModelList = cartItemModelList;
    }

    private OnItemCartClickListener mListener;
    //interface
    public interface OnItemCartClickListener {
        void onItemClick(int position);
        void onDeleteClick(int position);
        void onAddNumberClick(int position);
        void onRemoveNumberClick(int position);
    }

    public void setmListener(OnItemCartClickListener mListener) {
        this.mListener = mListener;
    }


    @Override
    public int getItemViewType(int position) {
        switch (cartItemModelList.get(position).getType()){
            case 0:
                return CartItemModel.CART_ITEM;
            case 1:
                return CartItemModel.TOTAL_AMOUNT;
            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType){
            case CartItemModel.CART_ITEM:
                View CartItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout, parent, false);
                return new CartItemViewHolder(CartItemView, mListener);
            case CartItemModel.TOTAL_AMOUNT:
                View CartTotalView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_total_amount_layout, parent, false);
                return new CartItemViewHolder(CartTotalView, mListener);

            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        switch (cartItemModelList.get(position).getType()){
            case CartItemModel.CART_ITEM:
                int resource = cartItemModelList.get(position).getProductImage();
                String title = cartItemModelList.get(position).getProductTitle();
                int price = cartItemModelList.get(position).getProductPrice();
                String cuttedPrice = cartItemModelList.get(position).getCuttedPrice();
                int quantity = cartItemModelList.get(position).getProductQuantity();

                ((CartItemViewHolder) holder).setItemDetails(resource, title, price, cuttedPrice, quantity);

                break;
            case CartItemModel.TOTAL_AMOUNT:
                String totalItems = cartItemModelList.get(position).getTotalItems();
                String totalItemPrice = cartItemModelList.get(position).getTotalItemPrice();
                String totalAmount = cartItemModelList.get(position).getTotalAmount();
                String savedAmount = cartItemModelList.get(position).getSavedAmount();

                ((CartTotalAmountViewHolder) holder).setTotalAmount(totalItems, totalItemPrice, totalAmount, savedAmount);

                break;
            default:
                return ;
        }
    }

    @Override
    public int getItemCount() {
        return cartItemModelList.size();
    }

    class CartItemViewHolder extends RecyclerView.ViewHolder{

        private ImageView productImage;
        private TextView productTitle;
        private TextView productPrice;
        private TextView cuttedPrice;
        private TextView productQuantity;
        private ImageView sub_quantity, add_quantity;
        private ImageView remove_item_btn;

        public CartItemViewHolder(@NonNull View itemView, final OnItemCartClickListener listener) {
            super(itemView);
            productImage = itemView.findViewById(R.id.product_image);
            productTitle = itemView.findViewById(R.id.product_title);
            productPrice = itemView.findViewById(R.id.product_price);
            cuttedPrice = itemView.findViewById(R.id.cutted_price);
            productQuantity = itemView.findViewById(R.id.product_quantity);
            remove_item_btn = itemView.findViewById(R.id.remove_item_btn);
            sub_quantity = itemView.findViewById(R.id.sub_quantity);
            add_quantity = itemView.findViewById(R.id.add_quantity);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });

            remove_item_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onDeleteClick(position);
                        }
                    }
                }
            });

            add_quantity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onAddNumberClick(position);
                        }
                    }
                }
            });

            sub_quantity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onRemoveNumberClick(position);
                        }
                    }
                }
            });

        }

        private void setItemDetails(int resource, String title, int price, String cutted, int quantity){
            productImage.setImageResource(resource);
            productTitle.setText(title);
            productPrice.setText(String.valueOf(price));
            cuttedPrice.setText(cutted);
            productQuantity.setText(String.valueOf(quantity));
        }
    }

    class CartTotalAmountViewHolder extends RecyclerView.ViewHolder{
        private TextView totalItems;
        private TextView totalItemPrice;
        private TextView totalAmount;
        private TextView savedAmount;

        public CartTotalAmountViewHolder(@NonNull View itemView) {
            super(itemView);

            totalItems = itemView.findViewById(R.id.totalItems);
            totalItemPrice = itemView.findViewById(R.id.totalItemPrice);
            totalAmount = itemView.findViewById(R.id.totalAmount);
            savedAmount = itemView.findViewById(R.id.savedAmount);
        }

        private void setTotalAmount(String totalItemsT, String totalItemPriceT, String totalAmountT, String savedAmountT){
            totalItems.setText(totalItemsT);
            totalItemPrice.setText(totalItemPriceT);
            totalAmount.setText(totalAmountT);
            savedAmount.setText(savedAmountT);
        }
    }
}
