package com.example.malygose.neteastmusic.ui.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.malygose.neteastmusic.R;
import com.example.malygose.neteastmusic.adapter.MusicFragmentPagerAdapter;
import com.example.malygose.neteastmusic.ui.fragment.FindMusicFragment;
import com.example.malygose.neteastmusic.ui.fragment.ListenMusicFragment;
import com.example.malygose.neteastmusic.ui.fragment.MusicVideoFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ListenMusicFragment.OnListenMusicFragmentSeleted {


//    @BindView(R.id.tableLayout_main_top)
//    TabLayout tableLayoutMainTop;
//    @BindView(R.id.viewpager_main_bottom)
//    ViewPager viewpagerMainBottom;
    private ArrayList<Fragment> fragmentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ViewPager viewpagerMainBottom=findViewById(R.id.viewpager_main_bottom);
        TabLayout tableLayoutMainTop=findViewById(R.id.tableLayout_main_top);
        fragmentsList = new ArrayList<>();
        FindMusicFragment findMusicFragment = FindMusicFragment.newInstance("", "");
        ListenMusicFragment listenMusicFragment = ListenMusicFragment.newInstance("", "");
        MusicVideoFragment musicVideoFragment = MusicVideoFragment.newInstance("", "");
        fragmentsList.add(findMusicFragment);
        fragmentsList.add(listenMusicFragment);
        fragmentsList.add(musicVideoFragment);
        MusicFragmentPagerAdapter musicFragmentPagerAdapter = new MusicFragmentPagerAdapter(getSupportFragmentManager(), this, fragmentsList);
        viewpagerMainBottom.setAdapter(musicFragmentPagerAdapter);
        tableLayoutMainTop.setupWithViewPager(viewpagerMainBottom);
    }

    @Override
    public void OnListenMusicFragmentSeleted(Uri uri) {

    }

    @Override
    public void DoSomethig(Object object) {

    }

    @OnClick({R.id.tableLayout_main_top, R.id.viewpager_main_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tableLayout_main_top:
                break;
            case R.id.viewpager_main_bottom:
                break;
        }
    }
}
