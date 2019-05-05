package com.kwhyr.rizkyapps.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kwhyr.rizkyapps.Model.FriendsModel;
import com.kwhyr.rizkyapps.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsHolder> {

    ArrayList<FriendsModel> mData;
    Context mContext;

    public FriendsAdapter(ArrayList<FriendsModel> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public FriendsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_friends, viewGroup, false);
        FriendsHolder vholder = new FriendsHolder(view);
        return vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsHolder friendsHolder, final int i) {
        friendsHolder.name.setText(mData.get(i).getName());
        friendsHolder.image.setImageResource(mData.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class FriendsHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView name;

        public FriendsHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imgfriends);
            name = itemView.findViewById(R.id.txtfriends);
        }
    }
}
