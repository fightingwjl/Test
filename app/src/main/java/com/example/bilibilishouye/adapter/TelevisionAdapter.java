package com.example.bilibilishouye.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bilibilishouye.R;
import com.example.bilibilishouye.bean.television;


import java.util.List;

public class TelevisionAdapter extends RecyclerView.Adapter<TelevisionHolde> {

    private List<television> televisions;
    private Context context;

    public TelevisionAdapter(List<television> televisions, Context context) {
        this.televisions = televisions;
        this.context = context;
    }

    @NonNull
    @Override
    public TelevisionHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item, parent, false);
        return new TelevisionHolde(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TelevisionHolde holder, int position) {
        holder.bindView(televisions.get(position));
    }

    @Override
    public int getItemCount() {
        return televisions.size();
    }
}
