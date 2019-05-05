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

import com.kwhyr.rizkyapps.Adapter.DailyAdapter;
import com.kwhyr.rizkyapps.Model.DailyModel;
import com.kwhyr.rizkyapps.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentDailyDaily extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<DailyModel> lstdailyact;

    public FragmentDailyDaily() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.daily_dailyfragment, container, false);
        recyclerView = v.findViewById(R.id.dailyact_rv);
        DailyAdapter dailyAdapter = new DailyAdapter(getContext(),lstdailyact);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(dailyAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstdailyact = new ArrayList<>();
        lstdailyact.add(new DailyModel("Tidur", "4-10 Jam", R.drawable.ic_bed));
        lstdailyact.add(new DailyModel("Sholat", "10 Menit", R.drawable.ic_pray));
        lstdailyact.add(new DailyModel("Mandi", "20 Menit", R.drawable.ic_bath));
        lstdailyact.add(new DailyModel("Makan & Minum", "15 Menit", R.drawable.ic_eat));
        lstdailyact.add(new DailyModel("Kuliah", "3-5 Jam", R.drawable.ic_campus));
        lstdailyact.add(new DailyModel("Belajar & Tugas", "0-4 Jam", R.drawable.ic_study));
        lstdailyact.add(new DailyModel("Bermain Game", "4-10 Jam", R.drawable.ic_game));
        lstdailyact.add(new DailyModel("Random Stuff", "0-4 Jam", R.drawable.ic_computer));
    }
}
