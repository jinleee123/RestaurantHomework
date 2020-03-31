package com.example.restauranthomework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ExampleViewHolder> {
    //creates an ArrayList that contains the exampleList
    private ArrayList<RestaurantItem> mExampleList;
    //Constructor
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        //create variable for views
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
        public TextView mTextView4;
        public TextView mTextView5;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
            mTextView3 = itemView.findViewById(R.id.textView3);
            mTextView4 = itemView.findViewById(R.id.textView4);
            mTextView5 = itemView.findViewById(R.id.textView5);
        }

    }
    //passes an arrayList of restaurant items
    public RestaurantAdapter(ArrayList<RestaurantItem> exampleList) {
        mExampleList = exampleList;
    }
    //passes layout into adapter and creates viewholder evh
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_row, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;

    }
    //passes values into the textViews and imageViews, with position we know what item we are currently looking at
    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        RestaurantItem currentItem = mExampleList.get(position);
        //calls getters to get information
        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
        holder.mTextView3.setText(currentItem.getmText3());
        holder.mTextView4.setText(currentItem.getmText4());
        holder.mTextView5.setText(currentItem.getmText5());

    }
    //Defines how many items will be in our list
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
