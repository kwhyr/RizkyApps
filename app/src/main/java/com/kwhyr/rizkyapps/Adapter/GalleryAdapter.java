package com.kwhyr.rizkyapps.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kwhyr.rizkyapps.View.DetailActivity;
import com.kwhyr.rizkyapps.R;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryHolder> {
    private Context mContext;
    private int[] mPlaceList;

    public GalleryAdapter(Context mContext, int[] mPlaceList) {
        this.mContext = mContext;
        this.mPlaceList = mPlaceList;
    }

    @NonNull
    @Override
    public GalleryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_fullsize, parent, false);
        return new GalleryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GalleryHolder holder, int position) {
        holder.mPlace.setImageResource(mPlaceList[position]);
        holder.mPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Image", mPlaceList[holder.getAdapterPosition()]);
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPlaceList.length;
    }
}

class GalleryHolder extends RecyclerView.ViewHolder {

    ImageView mPlace;

    public GalleryHolder(View itemView) {
        super(itemView);

        mPlace = itemView.findViewById(R.id.ivPlace);
    }
}
