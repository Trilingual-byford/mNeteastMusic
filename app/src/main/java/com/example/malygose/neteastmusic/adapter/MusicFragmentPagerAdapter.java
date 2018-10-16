package com.example.malygose.neteastmusic.adapter;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MusicFragmentPagerAdapter extends FragmentPagerAdapter {
    Context context;
    ArrayList<Fragment> fragmentList;

    public MusicFragmentPagerAdapter(FragmentManager fm, Context context, ArrayList<Fragment> fragmentList) {
        super(fm);
        this.context = context;
        this.fragmentList = fragmentList;
    }


    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
