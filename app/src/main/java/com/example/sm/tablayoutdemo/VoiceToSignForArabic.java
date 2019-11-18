package com.example.sm.tablayoutdemo;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class VoiceToSignForArabic extends Fragment  {

    EditText editText;
    protected static final int RESULT_SPEECH = 1;
    VideoView videoView;
    String[] separated;
    Button imageButton;
    ImageView voicebtn;
    private Translation translation = new Translation();
    private int k = 0;
    int i = 0;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.activity_voice_sign_arabic,container,false);
        videoView = (VideoView) view.findViewById(R.id.videoview2);


            videoView.setVideoURI(Uri.parse("android.resource://com.example.sm.tablayoutdemo/" + R.raw.start_fram));
            videoView.start();

            imageButton = (Button) view.findViewById(R.id.translatebutton);
            voicebtn = (ImageView) view.findViewById(R.id.voicebutton);
            editText = (EditText) view.findViewById(R.id.edittext);
            Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/flat.ttf");
            editText.setTypeface(typeface);

        voicebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,"ar-SA");
                try {
                    startActivityForResult(intent, RESULT_SPEECH);

                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getActivity().getApplicationContext(), "Unfortunately, this device does not support talk",
                            Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        return view;
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RESULT_SPEECH: {
                if (resultCode == getActivity().RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text2=text.get(0);
                    editText.setText(text2);
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
                break;
            }

        }
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
