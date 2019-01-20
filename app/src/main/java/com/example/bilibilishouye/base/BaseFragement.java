package com.example.bilibilishouye.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.bilibilishouye.bean.television;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFragement extends Fragment {

    public abstract int setIDResource ();

    private  View view;

    protected List<television> televisions = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(setIDResource(),container,false);
        this.view = view;
        initView();
        return view;
    }

    public  abstract void loadData();

    public  View  getView(){
        return  view;
    }

    public abstract  void  initView();
}

