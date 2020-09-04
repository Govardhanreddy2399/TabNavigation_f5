package com.example.tabnavigation_f5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.*;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    //tab navigation combined with swipe children screens right to left ,left to right
    //'eg:Whatsapp
    //displaying tabs is tablayout in the android design suppot library
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tab1);
        viewPager=findViewById(R.id.viewpager1);
        ViewPageAdapter viewPageAdapter1=new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdapter1.add(new calls(),"calls");
        viewPageAdapter1.add(new Chat(),"chat");
        viewPageAdapter1.add(new Status(),"chats");
        viewPager.setAdapter(viewPageAdapter1);
        tabLayout.setupWithViewPager(viewPager);
    }
}