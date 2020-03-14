package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class numberAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] image =
            {
                    R.drawable.oneno,
                    R.drawable.newone,
                    R.drawable.newtwo,
                    R.drawable.newthree,
                    R.drawable.newfour,
                    R.drawable.newfive,
                    R.drawable.newsix,
                    R.drawable.newaeven,
                    R.drawable.neweight,
                    R.drawable.noh,
                    R.drawable.das,
                    R.drawable.giyra,
                    R.drawable.bara,
                    R.drawable.tara,
                    R.drawable.choda,
                    R.drawable.pandra,
                    R.drawable.sola,
                    R.drawable.satara,
                    R.drawable.atara,
                    R.drawable.ons,
                    R.drawable.pes,
            };


    public numberAdapter(Context context) {
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
