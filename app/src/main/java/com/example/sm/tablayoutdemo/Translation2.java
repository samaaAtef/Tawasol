package com.example.sm.tablayoutdemo;

import android.content.Context;
import android.net.Uri;
import android.widget.VideoView;

public class Translation2 {
    public String trans2(String txt, VideoView imgchar, String c) {
        switch (txt) {
            case ("my"): {

                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.my));
                imgchar.start();
                break;
            }
            case ("name"): {

                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.name));
                imgchar.start();
                break;
            }case ("no"): {

                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.no));
                imgchar.start();
                break;
            }case ("yes"): {

                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.yes));
                imgchar.start();
                break;
            }case ("hello"): {

                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.hello));
                imgchar.start();
                break;
            }
            case ("go"):
            case("went"):
            case("travel"):
            case("goes"):{
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.go));
                imgchar.start();
                break;
            }
            case ("father"):
            case ("baba"):
                // case ("ابي"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.father));
                imgchar.start();
                break;
            }
            case ("to"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.to));
                imgchar.start();
                break;
            }
            case ("work"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.work));
                imgchar.start();
                break;
            }
            case ("food"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.food));
                imgchar.start();
                break;
            }
            case ("amazing"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.amazing));
                imgchar.start();
                break;
            }
            case ("good"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.good));
                imgchar.start();
                break;
            }

            case ("system"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.system));
                imgchar.start();
                break;
            }
            case ("deaf"):
            case ("hear-impaired"):

            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.deaf));
                imgchar.start();
                break;
            }
            case ("communicate"):
            case ("communication"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.communicate_communication));
                imgchar.start();
                break;
            }
            case ("amrican"):
            case ("football"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.amrican_football));
                imgchar.start();
                break;
            }
            case ("for"):
            case ("intended"):
            case ("belong"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.for_intendedto_belong_to));
                imgchar.start();
                break;
            }
            case ("too"):
            case ("besides"):
            case ("addition"):
            case ("in"):
            case ("well"):
            case ("as"):
            {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a28_y));
                imgchar.start();
                break;
            }
            default: {
                return "def";
            }
        }
        return "";
    }

    public  String  trans1(VideoView imgchar, char txt, String c) {
        switch (txt) {

            case ('a'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a14_a));
                imgchar.start();
                return "a";
            }
            case ('b'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a22_b));
                imgchar.start();
                return "b";
            }
            case ('c'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.c));
                imgchar.start();
                return "c";
            }
            case ('d'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.d));
                imgchar.start();
                return "d";
            }
            case ('e'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.e));
                imgchar.start();
                return "e";
            }
            case ('f'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.f));
                imgchar.start();
                return "f";
            }
            case ('g'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a8_g));
                imgchar.start();
                return "g";
            }
            case ('h'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a18_h));
                imgchar.start();
                return "h";
            }
            case ('i'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a24_i));
                imgchar.start();
                return "i";
            }
            case ('j'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.j));
                imgchar.start();
                return "j";
            }
            case ('k'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.k));
                imgchar.start();
                return "k";
            }
            case ('l'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a23_l));
                imgchar.start();
                return "l";
            }
            case ('m'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.m));
                imgchar.start();
                return "m";
            }
            case ('n'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.n));
                imgchar.start();
                return "n";
            }
            case ('o'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.o));
                imgchar.start();
                return "o";
            }
            case ('p'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.p));
                imgchar.start();
                return "p";
            }
            case ('q'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.q));
                imgchar.start();
                return "q";
            }
            case ('r'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.r));
                imgchar.start();
                return "r";
            }
            case ('s'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.s));
                imgchar.start();
                return "s";
            }
            case ('t'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.t));
                imgchar.start();
                return "t";
            }
            case ('u'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.u));
                imgchar.start();
                return "u";
            }
            case ('v'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a3_v));
                imgchar.start();
                return "v";
            }
            case ('w'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a4_w));
                imgchar.start();
                return "w";
            }
            case ('x'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.x));
                imgchar.start();
                return "x";
            }
            case ('y'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.a28_y));
                imgchar.start();
                return "y";
            }
            case ('z'): {
                imgchar.setVideoURI(Uri.parse("android.resource://" + c + "/" + R.raw.z));
                imgchar.start();
                return "z";
            }

            default:
            {
                return "error";
            }
        }
    }
}