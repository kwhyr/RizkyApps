package com.kwhyr.rizkyapps.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kwhyr.rizkyapps.Model.DailyModel;
import com.kwhyr.rizkyapps.R;

import java.util.List;

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.DailyHolder> {
    Context mContext;
    List<DailyModel> mData;

    public DailyAdapter(Context mContext, List<DailyModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public DailyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_daily, viewGroup, false);
        DailyHolder vholder = new DailyHolder(view);
        return vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyHolder dailyHolder, int i) {
        dailyHolder.tv_name.setText(mData.get(i).getName());
        dailyHolder.tv_time.setText(mData.get(i).getTime());
        dailyHolder.img.setImageResource(mData.get(i).getPhoto());
    }

    @Override
    public int getItemCount() { return mData.size(); }

    public static class DailyHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_time;
        private ImageView img;
        public DailyHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.activityname);
            tv_time = itemView.findViewById(R.id.activitytime);
            img = itemView.findViewById(R.id.imgdaily);
        }
    }

}

