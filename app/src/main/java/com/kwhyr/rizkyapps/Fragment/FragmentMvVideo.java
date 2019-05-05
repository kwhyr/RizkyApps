package com.kwhyr.rizkyapps.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kwhyr.rizkyapps.Adapter.VideoAdapter;
import com.kwhyr.rizkyapps.Adapter.VideoModel;
import com.kwhyr.rizkyapps.R;

import java.util.Vector;

public class FragmentMvVideo extends Fragment {
    View v;

    RecyclerView recyclerView;
    Vector<VideoModel> youtubeVideo = new Vector<VideoModel>();

    public FragmentMvVideo() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.mv_videofragment, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(getActivity()));
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideo);

        recyclerView.setAdapter(videoAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        youtubeVideo.add( new VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tlRByTaOjkE\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>") );
        youtubeVideo.add( new VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9wh8FgsEtNQ\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>") );
        youtubeVideo.add( new VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/wol-XHb1VhM\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>") );
        youtubeVideo.add( new VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/u-DtEUyaLUg\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>") );

    }
}
