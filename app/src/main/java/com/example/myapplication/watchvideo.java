package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Vector;

public class watchvideo extends AppCompatActivity {
private RecyclerView recyclerView;
Vector <youtubevideos> youtubevideos = new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watchvideo);
        recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/94NuFTMBBOY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hq3yfQnllfQ\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BELlZKpi1Zs\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fHqjNHxmB7c\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3RywqqJkM8I\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/OTUg_4TvCWY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/t99ULJjCsaM\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ea5-SIe5l7M\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/m5jd3UyO_aY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IT4l0PdgAkc\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubevideos.add(new youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7isSwerYaQc\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        videoAdopte videoAdopte = new videoAdopte(youtubevideos);
        recyclerView.setAdapter(videoAdopte);
    }

}
