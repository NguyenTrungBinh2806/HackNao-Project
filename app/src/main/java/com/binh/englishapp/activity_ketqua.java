package com.binh.englishapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;



public class activity_ketqua extends Activity {
    RelativeLayout BT;
    TextView KQ, Sai, mota;
    ImageView img;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);
        KQ = (TextView) findViewById(R.id.TxtKQ);
        mota=findViewById(R.id.mota);
        img = findViewById(R.id.img);
        BT = (RelativeLayout) findViewById(R.id.BtnBack);
//Phần Intent và Bundle đã giải thích code ở bài trước
        Intent callerIntent=getIntent();
        Bundle packageFromCaller= callerIntent.getBundleExtra("MyPackage");
        KQ.setText(packageFromCaller.getInt("KQ")+"/"+

                packageFromCaller.getInt("Socau"));

        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_ketqua.this,LuyenTap.class);
                startActivity(intent);
                finish();
            }
        });

        if(packageFromCaller.getInt("KQ")<=15){
            mota.setText("Cõ lẽ bạn vẫn chưa học bài kĩ, Hãy cố gắng hơn nhé!");
            img.setImageDrawable(getResources().getDrawable(R.drawable.tryhard));
        }
        if(packageFromCaller.getInt("KQ")>=16 && packageFromCaller.getInt("KQ")<=19 ){
            mota.setText("Còn một chút nữa thôi nè!");
            img.setImageDrawable(getResources().getDrawable(R.drawable.tryhard2));
        }
        if(packageFromCaller.getInt("KQ")==20){
            mota.setText("Tốt lắm, cùng cố gắng hơn nào");
            img.setImageDrawable(getResources().getDrawable(R.drawable.tryhard3));
        }
        if(packageFromCaller.getInt("KQ")==21){
            mota.setText("Tuyệt vời");
            img.setImageDrawable(getResources().getDrawable(R.drawable.tryhard4));
        }


    }

}

