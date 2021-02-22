package com.example.adminpanel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter {

    Context context;
    List<ProductDetailsCart> productDetailsCarts;

    public CartAdapter(Context context, List<ProductDetailsCart> productDetailsCarts) {
        this.context = context;
        this.productDetailsCarts = productDetailsCarts;
    }

    public static class MyHolderView extends RecyclerView.ViewHolder{

        TextView productName, productPrice, quantity;
        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.productNameTextView);
            productPrice = itemView.findViewById(R.id.productPriceTextView);
            quantity = itemView.findViewById(R.id.quantityTextView);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cart_design,parent, false);
        return new MyHolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolderView myHolderView = (MyHolderView) holder;
        ProductDetailsCart productDetailsCart = productDetailsCarts.get(position);

        myHolderView.productPrice.setText("200");
        myHolderView.productName.setText("Product name");
        myHolderView.quantity.setText("2");
    }

    @Override
    public int getItemCount() {
        return productDetailsCarts.size();
    }
}
