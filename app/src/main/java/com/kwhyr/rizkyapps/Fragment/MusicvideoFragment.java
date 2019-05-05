package com.kwhyr.rizkyapps.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kwhyr.rizkyapps.Adapter.ViewPagerAdapter;
import com.kwhyr.rizkyapps.R;

public class MusicvideoFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_musicvideo, container, false);

        TabLayout tablayout = v.findViewById(R.id.mvtablayout);
        ViewPager viewPager = v.findViewById(R.id.mvviewpager);

        setupViewPager(viewPager);
        tablayout.setupWithViewPager(viewPager);

        return v;
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPagerAdapter.AddFragment(new FragmentMvMusic(), "Music Favorite");
        viewPagerAdapter.AddFragment(new FragmentMvVideo(), "Video Favorite");
        viewPager.setAdapter(viewPagerAdapter);
    }
}
