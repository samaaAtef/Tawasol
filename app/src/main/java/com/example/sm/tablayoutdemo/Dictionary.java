package com.example.sm.tablayoutdemo;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary extends Fragment {

    String[] name;
    //*************************************
    ArrayList<String> listname;
    CustomAdapter customAdapter;
    ListView listView;
    TextView textView;
    VideoView videoView;
    RelativeLayout relativeLayout;
    Typeface typeface;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.activity_dictionary,container,false);
        typeface =Typeface.createFromAsset(getActivity().getAssets(), "fonts/flat.ttf");
        relativeLayout=(RelativeLayout)view.findViewById(R.id.relativedictionaryarabic);
        listView=(ListView)view.findViewById(R.id.list_view);
        Resources res = getResources();
        textView = (TextView) view.findViewById(R.id.txtview);
        videoView = (VideoView) view.findViewById(R.id.videoview2);
        name = res.getStringArray(R.array.name) ;
        listname=new ArrayList<>(Arrays.asList(name));
        customAdapter=new CustomAdapter(getActivity().getApplicationContext(),typeface,listname);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                relativeLayout.setVisibility(View.GONE);
                String text=((TextView)view).getText().toString();
                textView.setTypeface(typeface);
                TranslationForW.trans2(videoView, text, getActivity());
                textView.setText(text);
            }
        });
        return view;
    }
    public boolean onBackPressed() {
        relativeLayout.setVisibility(View.VISIBLE);
        return true;
    }
}
