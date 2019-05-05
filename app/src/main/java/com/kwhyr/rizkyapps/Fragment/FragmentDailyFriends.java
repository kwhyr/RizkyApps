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

import com.kwhyr.rizkyapps.Adapter.FriendsAdapter;
import com.kwhyr.rizkyapps.Model.FriendsModel;
import com.kwhyr.rizkyapps.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentDailyFriends extends Fragment {
    View v;

    private RecyclerView recyclerView;
    private List<FriendsModel> lstfriends;

    public FragmentDailyFriends() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.daily_friendsfragment, container, false);

        recyclerView = v.findViewById(R.id.friends_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        FriendsAdapter friendsAdapter = new FriendsAdapter((ArrayList<FriendsModel>) lstfriends, getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(friendsAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstfriends = new ArrayList<>();
        lstfriends.add(new FriendsModel("Rizqi Zein", R.drawable.zein));
        lstfriends.add(new FriendsModel("Fikih Zaman", R.drawable.fikih));
        lstfriends.add(new FriendsModel("Aditya Maulana", R.drawable.adit));
        lstfriends.add(new FriendsModel("Bobby Rafika", R.drawable.bob));
        lstfriends.add(new FriendsModel("Fritson Agung", R.drawable.fritson));
    }
}
