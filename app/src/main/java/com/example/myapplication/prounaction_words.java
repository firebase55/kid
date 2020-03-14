package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prounaction_words extends AppCompatActivity {
    ViewPager vieww;
     Button more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prounaction_words);
        vieww = (ViewPager) findViewById(R.id.page);
        prounaction adp = new prounaction(this);
        vieww.setAdapter(adp);

    }
}
