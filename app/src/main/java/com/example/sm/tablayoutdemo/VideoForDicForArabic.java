package com.example.sm.tablayoutdemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoForDicForArabic extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_for_dic_arabic);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/flat.ttf");
        textView = (TextView) findViewById(R.id.txtview);
        textView.setTypeface(myTypeface);
        Intent intent = getIntent();
        VideoView videoView = (VideoView) findViewById(R.id.videoview2);


            TranslationForW.trans2(videoView, intent.getStringExtra("dicword"), this);
            textView.setText(intent.getStringExtra("dicword"));

    }
}
