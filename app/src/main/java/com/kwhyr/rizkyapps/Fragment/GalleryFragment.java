package com.kwhyr.rizkyapps.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kwhyr.rizkyapps.Adapter.GalleryAdapter;
import com.kwhyr.rizkyapps.R;

public class GalleryFragment extends Fragment {
    RecyclerView mRecyclerView;
    int[] mPlaceList;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_gallery, container, false);

        mRecyclerView = view.findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(getActivity(), 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mPlaceList = new int[]{R.drawable.img1, R.drawable.img2, R.drawable.img3,
                R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7,
                R.drawable.img8};

        GalleryAdapter galleryAdapter = new GalleryAdapter(getActivity(), mPlaceList);
        mRecyclerView.setAdapter(galleryAdapter);


        return view;
    }
}
