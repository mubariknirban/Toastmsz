package com.example.myapplication;

import android.content.Context;
import android.widget.Toast;

public class Toastpt {
    
    public static void tst(Context c,String msz){

        Toast.makeText(c,msz,Toast.LENGTH_SHORT).show();
    }
}
