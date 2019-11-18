package com.example.sm.tablayoutdemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Setting extends Fragment {

    TextView txtarabic,txtenglish;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.setting_activity,container,false);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/flat.ttf");

        txtarabic=(TextView)view.findViewById(R.id.txtarabic);
        txtenglish=(TextView)view.findViewById(R.id.txtenglish);
        txtarabic.setTypeface(typeface);
        txtenglish.setTypeface(typeface);

        txtarabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Main2Activity.class);
                startActivity(intent);
            }
        });
         txtenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
