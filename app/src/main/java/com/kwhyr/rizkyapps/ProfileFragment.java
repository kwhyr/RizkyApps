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

public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_profile, container, false);

        final TabLayout tablayout = v.findViewById(R.id.profiletablayout);
        final ViewPager viewPager = v.findViewById(R.id.profileviewpager);
        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getFragmentManager());

        viewPagerAdapter.AddFragment(new FragmentProfileProfile(),"Profile");
        viewPagerAdapter.AddFragment(new FragmentProfileAbout(),"About");

        viewPager.setAdapter(viewPagerAdapter);
        tablayout.setupWithViewPager(viewPager);

        return v;
    }
}
