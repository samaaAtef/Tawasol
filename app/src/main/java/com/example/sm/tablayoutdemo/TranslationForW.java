package com.example.sm.tablayoutdemo;

import android.content.Context;
import android.net.Uri;
import android.widget.VideoView;

public class TranslationForW {


    public static String  trans2(VideoView imgchar, String txt, Context c) {
        switch (txt) {
            case ("ا"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a1));
                imgchar.start();
                return "ا";
            }
            case ("ب"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a2));
                imgchar.start();
                return "ب";
            }
            case ("ت"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a3_v));
                imgchar.start();
                return "ت";
            }
            case ("ث"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a4_w));
                imgchar.start();
                return "ث";
            }
            case ("ج"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a5));
                imgchar.start();
                return "ج";
            }
            case ("ح"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a6));
                imgchar.start();
                return "ح";
            }
            case ("خ"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a7));
                imgchar.start();
                return "خ";
            }
            case ("د"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a8_g));
                imgchar.start();
                return "د";
            }
            case ("ذ"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a9));
                imgchar.start();
                return "ذ";
            }
            case ("ر"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a10));
                imgchar.start();
                return "ر";
            }
            case ("ز"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a11));
                imgchar.start();
                return "ز";
            }
            case ("س"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a12));
                imgchar.start();
                return "س";
            }
            case ("ش"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a13));
                imgchar.start();
                return "ش";
            }
            case ("ص"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a14_a));
                imgchar.start();
                return "ص";
            }
            case ("ض"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a15));
                imgchar.start();
                return "ض";
            }
            case ("ط"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a16));
                imgchar.start();
                return "ط";
            }
            case ("ظ"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a17));
                imgchar.start();
                return "ظ";
            }
            case ("ع"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a18_h));
                imgchar.start();
                return "ع";
            }
            case ("غ"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a19));
                imgchar.start();
                return "غ";
            }
            case ("ف"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a20));
                imgchar.start();
                return "ف";
            }
            case ("ق"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a21));
                imgchar.start();
                return "ق";
            }
            case ("ك"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a22_b));
                imgchar.start();
                return "ك";
            }
            case ("م"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a23_l));
                imgchar.start();
                return "م";
            }
            case ("ن"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a24_i));
                imgchar.start();
                return "ن";
            }
            case ("ه"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a25));
                imgchar.start();
                return "ه";
            }
            case ("و"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a26));
                imgchar.start();
                return "و";
            }
            case ("ل"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a28_y));
                imgchar.start();
                return "ل";
            }

            case ("ي"): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a27));
                imgchar.start();
                return "ي";
            }
            case ("طعام"):
            case ("الطعام"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.food));
                imgchar.start();
                break;
            }
            default: {
                return "dd";
            }
        }
        return "";
    }
}