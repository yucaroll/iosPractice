package com.miniandroid.myzzung.supoint.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.miniandroid.myzzung.supoint.R;

public class NotificationActivity extends AppCompatActivity{

    private final String TAG = "NotificationActivity";
    private final String ACTIONBAR_TITLE = "공지사항";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        getSupportActionBar().setTitle(ACTIONBAR_TITLE);


    }
}
