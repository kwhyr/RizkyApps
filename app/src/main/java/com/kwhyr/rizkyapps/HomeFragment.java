package com.kwhyr.rizkyapps;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_home, container, false);

        TabLayout tablayout = v.findViewById(R.id.hometablayout);
        ViewPager viewPager = v.findViewById(R.id.homeviewpager);

        setupViewPager(viewPager);
        tablayout.setupWithViewPager(viewPager);

        return v;
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPagerAdapter.AddFragment(new FragmentHomeProfile(), "Profile");
        viewPagerAdapter.AddFragment(new FragmentHomeInterest(), "Interest");
        viewPager.setAdapter(viewPagerAdapter);
    }
}
