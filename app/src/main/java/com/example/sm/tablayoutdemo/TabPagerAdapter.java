package com.example.sm.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm,int numOfTab) {
        super(fm);
        this.tabCount=numOfTab;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TextToSign tab1 = new TextToSign();
                return tab1;
            case 1:
                VoiceToSign tab2 = new VoiceToSign();
                return tab2;
            case 2:
                Video tab3 = new Video();
                return tab3;
            case 3:
                Dictionary tab4 = new Dictionary();
                return tab4;
            case 4:
                Setting tab5 = new Setting();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;

    }
}
