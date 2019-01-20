package com.example.bilibilishouye.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bilibilishouye.R;
import com.example.bilibilishouye.bean.television;

public class TelevisionHolde extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;

    public  TelevisionHolde(View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        textView = itemView.findViewById(R.id.text_view);
    }
    public  void bindView(television television){
        imageView.setImageResource(television.getImage());
        textView.setText(television.getTitle());
    }
}
