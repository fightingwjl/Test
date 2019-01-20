package com.example.bilibilishouye.fragement;

import android.support.v7.widget.RecyclerView;

import com.example.bilibilishouye.R;
import com.example.bilibilishouye.base.BaseFragement;

public class CartonFragement extends BaseFragement {
    private RecyclerView recyclerView;
    @Override
    public int setIDResource() {
        return R.layout.carton_fragement;
    }

    @Override
    public void loadData() {

    }

    @Override
    public void initView() {
        recyclerView = getView().findViewById(R.id.television_recycler_view);
    }
}
