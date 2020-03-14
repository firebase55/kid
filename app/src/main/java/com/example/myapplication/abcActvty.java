package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
public class abcActvty extends AppCompatActivity {
ViewPager vieww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc_actvty);
        vieww = (ViewPager) findViewById(R.id.viewpagerid);
        adapter_class adp = new adapter_class(this);
        vieww.setAdapter(adp);
    }
}
