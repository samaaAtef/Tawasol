package com.example.sm.tablayoutdemo;

import android.content.Context;
import android.net.Uri;
import android.widget.VideoView;

public class Translation {
    public String trans(String txt, VideoView imgchar, Context c) {
        switch (txt) {
            case ("طعام"):
            case ("الطعام"):
                {
                    imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.food));
                    imgchar.start();
                    break;
                }
            case ("مرحبا"):
                {
                    imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.marhaba));
                    imgchar.start();
                    break;
                }case ("وداعا"):
                {
                    imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.wda3n));
                    imgchar.start();
                    break;
                }


            default: {
                return "def";
            }
        }
        return "";
    }
    public  String  trans2(VideoView imgchar, char txt, Context c) {
        switch (txt) {
            case ('ا'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a1));
                imgchar.start();
                break;
            }
            case ('ب'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a2));
                imgchar.start();
                break;
            }
            case ('ت'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a3_v));
                imgchar.start();
                break;
            }
            case ('ث'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a4_w));
                imgchar.start();
                break;
            }
            case ('ج'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a5));
                imgchar.start();
                break;
            }
            case ('ح'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a6));
                imgchar.start();
                break;
            }
            case ('خ'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a7));
                imgchar.start();
                break;
            }
            case ('د'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a8_g));
                imgchar.start();
                break;
            }
            case ('ذ'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a9));
                imgchar.start();
                break;
            }
            case ('ر'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a10));
                imgchar.start();
                break;
            }
            case ('ز'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a11));
                imgchar.start();
                break;
            }
            case ('س'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a12));
                imgchar.start();
                break;
            }
            case ('ش'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a13));
                imgchar.start();
                break;
            }
            case ('ص'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a14_a));
                imgchar.start();
                break;
            }
            case ('ض'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a15));
                imgchar.start();
                break;
            }
            case ('ط'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a16));
                imgchar.start();
                break;
            }
            case ('ظ'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a17));
                imgchar.start();
                break;
            }
            case ('ع'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a18_h));
                imgchar.start();
                break;
            }
            case ('غ'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a19));
                imgchar.start();
                break;
            }
            case ('ف'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a20));
                imgchar.start();
                break;
            }
            case ('ق'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a21));
                imgchar.start();
                break;
            }
            case ('ك'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a22_b));
                imgchar.start();
                break;
            }
            case ('ل'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c.getPackageName() + "/" + R.raw.a23_l));
                imgchar.start();
                break;
            }

            case ('م'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a24_i));
                imgchar.start();
                break;
            }
            case ('ن'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/" + R.raw.a25));
                imgchar.start();
                break;
            }
            case ('ه'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a26));
                imgchar.start();
                break;
            }
            case ('و'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a27));
                imgchar.start();
                break;
            }
            case ('ي'): {
                imgchar.setVideoURI(Uri.parse("android.resource://"+c.getPackageName()+"/"+ R.raw.a28_y));
                imgchar.start();
                break;
            }
            default:
            {
                return "error";
            }
        }
        return "";
    }
}
