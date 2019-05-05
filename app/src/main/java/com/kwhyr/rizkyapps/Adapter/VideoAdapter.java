package com.kwhyr.rizkyapps.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.kwhyr.rizkyapps.R;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoHolder> {
    private List<VideoModel> youtubeVideoList;


    public VideoAdapter(List<VideoModel> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    @NonNull
    @Override
    public VideoHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( viewGroup.getContext()).inflate(R.layout.item_video, viewGroup, false);
        return new VideoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoHolder videoHolder, int i) {
        videoHolder.videoWeb.loadData( youtubeVideoList.get(i).getUrl(), "text/html" , "utf-8" );

    }

    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    public class VideoHolder extends RecyclerView.ViewHolder {
        WebView videoWeb;

        public VideoHolder(View itemView) {
            super(itemView); {

                videoWeb = itemView.findViewById(R.id.videoWebView);
                videoWeb.getSettings().setJavaScriptEnabled(true);
                videoWeb.setWebChromeClient(new WebChromeClient());

            };
        }
    }
}
