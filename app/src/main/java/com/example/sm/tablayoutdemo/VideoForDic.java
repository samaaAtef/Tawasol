package com.example.sm.tablayoutdemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoForDic extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_for_dic);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/flat.ttf");
        textView = (TextView) findViewById(R.id.txtview);
        textView.setTypeface(myTypeface);
        Intent intent = getIntent();
        VideoView videoView = (VideoView) findViewById(R.id.videoview2);

        if (intent.getStringExtra("dicword") == "communication system for hear-impaired" || intent.getStringExtra("dicword") == "communication system for hear impaired") {
            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
            videoView.start();
        } else {
            TranslationForW2.trans3(videoView, intent.getStringExtra("dicword"), this);
            textView.setText(intent.getStringExtra("dicword"));
        }
    }
}
