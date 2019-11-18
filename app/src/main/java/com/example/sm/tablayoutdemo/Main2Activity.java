package com.example.sm.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.settings));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.dicti));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.video));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.voice));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.text));


        final ViewPager viewPager =
                (ViewPager) findViewById(R.id.pager);
        final TabPagerAdapterForArabic adapter = new TabPagerAdapterForArabic(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

    }

    @Override
    public void onBackPressed() {

        List fragmentList = getSupportFragmentManager().getFragments();

        boolean handled = false;
        for(Object f : fragmentList) {
            if(f instanceof DictionaryForArabic) {
                handled = ((DictionaryForArabic)f).onBackPressed();

                if(handled) {
                    break;
                }
            }
            else
            {

            }
        }

        if(!handled) {
            super.onBackPressed();
        }
    }

}





