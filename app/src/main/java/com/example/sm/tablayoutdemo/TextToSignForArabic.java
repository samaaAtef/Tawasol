package com.example.sm.tablayoutdemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.VideoView;

public class TextToSignForArabic extends Fragment {

    EditText editText;
    VideoView videoView;
    String[] separated;
    ImageView imageButton;
    private Translation translation = new Translation();
    private int k = 0;
    int i = 0;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.activity_text_sign_arabic,container,false);

        Intent intent=getActivity().getIntent();
        videoView = (VideoView) view.findViewById(R.id.videoview2);
        videoView.setVideoURI(Uri.parse("android.resource://"+getActivity().getPackageName()+"/" + R.raw.start_fram));
        videoView.start();

        imageButton = (ImageView) view.findViewById(R.id.translatebutton);
        editText = (EditText) view.findViewById(R.id.edittext);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/flat.ttf");
        editText.setTypeface(typeface);

        try {
            editText.setText(intent.getStringExtra("dicword"));
        }catch (Exception e)
        {

        }
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;
                k=0;

                    final String currentString = editText.getText().toString();
                    separated = currentString.split(" ");

                    transate();

                    videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            transate();
                        }
                    });


            }
        });
        return view;

    }

    private void transate() {

        if (i < separated.length) {
            if (translation.trans(separated[i], videoView,getActivity()) == "def") {
                if (k < separated[i].length()) {
                    translation.trans2(videoView, separated[i].charAt(k),getActivity());
                    k++;
                } else {
                    k = 0;
                    i++;
                    transate();
                }
            } else {
                {
                    translation.trans(separated[i], videoView,getActivity());
                    i++;
                }
            }
        }
    }



}