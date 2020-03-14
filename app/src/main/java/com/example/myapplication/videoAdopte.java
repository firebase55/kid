package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class videoAdopte extends RecyclerView.Adapter<videoAdopte.videoViewHolder> {

    List <youtubevideos> youtubevideosList;
    public videoAdopte()
    {

    }

    @NonNull
    @Override
    public videoAdopte.videoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view,parent,false);
        return new videoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull videoAdopte.videoViewHolder holder, int position) {
holder.videoweb.loadData(youtubevideosList.get(position).getVideouri(),"text/html" , "utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubevideosList.size();
    }

    public videoAdopte(List<com.example.myapplication.youtubevideos> youtubevideos) {
        this.youtubevideosList = youtubevideos;
    }
    public class videoViewHolder extends RecyclerView.ViewHolder
    {

        WebView videoweb;
        public videoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoweb = (WebView)itemView.findViewById(R.id.webvdeo);
            videoweb.getSettings().setJavaScriptEnabled(true);
            videoweb.setWebChromeClient(new WebChromeClient());
        }
    }
}
