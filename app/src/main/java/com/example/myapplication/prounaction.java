package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class prounaction extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] image =
            {R.drawable.women,
                    R.drawable.bowel,R.drawable.chaos,
                    R.drawable.data,R.drawable.often, R.drawable.base,R.drawable.resume,
                    R.drawable.prounaction,R.drawable.promotion,R.drawable.thumb,R.drawable.colleg,
                    R.drawable.coupen,R.drawable.suite,R.drawable.w,R.drawable.resperre,
                    R.drawable.resturent,R.drawable.vegatble,R.drawable.diveroos,R.drawable.carmel,
                    R.drawable.moss,R.drawable.buffet,R.drawable.onion,R.drawable.es,
                    R.drawable.alm,
            };

    public prounaction(Context context) {
        this.context = context;
    }

    @Override
    public int getCount()
    {
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
        View view = layoutInflater.inflate(R.layout.prolayout,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.proid );
        Button button = (Button)view.findViewById(R.id.more);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.scoopwhoop.com/inothernews/wrong-pronunciation-words/"));
                context.startActivity(browserIntent);
            }
        });
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
