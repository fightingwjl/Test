package com.example.bilibilishouye;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.bilibilishouye.base.BaseFragement;
import com.example.bilibilishouye.fragement.CartonFragement;
import com.example.bilibilishouye.fragement.DishFragement;
import com.example.bilibilishouye.fragement.TelevisionFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragementManger = getSupportFragmentManager();
    private BaseFragement[] fragements= {new TelevisionFragment(), new CartonFragement(),new DishFragement()};

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    changeFragemnet(0);
                    return true;
                case R.id.navigation_dashboard:
                    changeFragemnet(1);
                    return true;
                case R.id.navigation_notifications:
                    changeFragemnet(2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

    /*
    初始化fragement
     */
    private  void initFragement(){
        for (int i = 0; i <3 ; i++) {
            fragementManger.beginTransaction().add(R.id.fragement_container,fragements[i]).commit();
        }
       }

       private  void changeFragemnet(int position){
           fragementManger.beginTransaction().
                   replace(R.id.fragement_container,fragements[position]).commit();
       }
    }

