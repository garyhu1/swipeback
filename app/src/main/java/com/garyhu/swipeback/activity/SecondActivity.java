package com.garyhu.swipeback.activity;

import android.os.Bundle;

import com.garyhu.swipeback.R;
import com.garyhu.swipeback.base.SwipeBackActivity;


/**
 * 作者： garyhu.
 * 时间： 2017/2/5.
 * 继承自定义的SwipeBackActivity
 */

public class SecondActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
