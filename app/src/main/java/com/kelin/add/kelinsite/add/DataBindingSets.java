package com.kelin.add.kelinsite.add;

import android.graphics.Typeface;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class DataBindingSets {
    @BindingAdapter("setTypeface")
    public static  void setTypeface(TextView view , Typeface typeface){
        if(typeface!=null){
            view.setTypeface(typeface);
            view.getPaint().setAntiAlias(false);
        }
    }
    @BindingAdapter("size")
    public static  void setSize(TextView view , Typeface typeface){
        if(typeface!=null){
            view.setTypeface(typeface);
            view.getPaint().setAntiAlias(false);
        }
    }
}
