package com.garyhu.swipeback.activity;

import android.os.Bundle;

import com.garyhu.swipeback.R;

import nsu.edu.com.library.SwipeBackActivity;

/**
 * 作者： garyhu.
 * 时间： 2017/2/5.
 * 继承library中的SwipeBackActivity
 */

public class ThirdActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}
