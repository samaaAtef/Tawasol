package com.example.sm.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapterForArabic extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapterForArabic(FragmentManager fm, int numOfTab) {
        super(fm);
        this.tabCount=numOfTab;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                SettingForArabic tab1 = new SettingForArabic();
                return tab1;
            case 1:
                DictionaryForArabic tab2 = new DictionaryForArabic();
                return tab2;
            case 2:
                VideoForArabic tab3 = new VideoForArabic();
                return tab3;
            case 3:
                VoiceToSignForArabic tab4 = new VoiceToSignForArabic();
                return tab4;
            case 4:
                TextToSignForArabic tab5 = new TextToSignForArabic();
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
