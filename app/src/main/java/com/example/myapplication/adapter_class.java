package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class adapter_class extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] image =
            {
                    R.drawable.aa,
                    R.drawable.apple,
            R.drawable.bb,R.drawable.cc,
            R.drawable.dd,R.drawable.egg,R.drawable.ff, R.drawable.gg,R.drawable.hh,
            R.drawable.ii,R.drawable.jj,R.drawable.kk,R.drawable.ll,
            R.drawable.mm,R.drawable.nn,R.drawable.oo,R.drawable.pp,
            R.drawable.qq,R.drawable.rr,R.drawable.news,R.drawable.tt,
            R.drawable.uv,R.drawable.vv,R.drawable.newwatch,R.drawable.xf,
                    R.drawable.yoga,
            R.drawable.zb,
    };


    public adapter_class(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.customlayout,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageid);
        imageView.setImageResource(image[position]);
        ViewPager viewPager = (ViewPager)container;
        viewPager.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager)container;
        View view = (View)object;
        viewPager.removeView(view);
    }
}
