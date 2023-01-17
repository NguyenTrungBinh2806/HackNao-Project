package com.binh.englishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class activity_hoctu extends Activity {
    RelativeLayout BT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoctu);

        BT = (RelativeLayout) findViewById(R.id.BtnBack);
//Phần Intent và Bundle đã giải thích code ở bài trước

        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_hoctu.this,HocTu.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
