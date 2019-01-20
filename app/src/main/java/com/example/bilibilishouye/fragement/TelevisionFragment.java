package com.example.bilibilishouye.fragement;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bilibilishouye.R;
import com.example.bilibilishouye.adapter.TelevisionAdapter;
import com.example.bilibilishouye.base.BaseFragement;
import com.example.bilibilishouye.bean.television;

public class TelevisionFragment extends BaseFragement {


private RecyclerView recyclerView;
private TelevisionAdapter adapter;

    @Override
    public int setIDResource() {
        return R.layout.television_fragement;
    }

    @Override
    public void loadData() {
        for (int i = 0; i <10 ; i++) {
            television television = new television(R.drawable.ic_television,"我是电视机");
            televisions.add(television);
        }
    }

    @Override
    public void initView() {
        recyclerView = getView().findViewById(R.id.television_recycler_view);
        adapter = new TelevisionAdapter(televisions,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}

