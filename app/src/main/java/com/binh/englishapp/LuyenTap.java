package com.binh.englishapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
public class LuyenTap extends AppCompatActivity {

    CardView B1, B2,B3, B4,B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, B22, B23, B24, B25;
    ImageButton back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luyentap);
        back = findViewById(R.id.BtnBack);
        B1 = findViewById(R.id.cardV1);
        B2 = findViewById(R.id.cardV2);
        B3 = findViewById(R.id.cardV3);
        B4 = findViewById(R.id.cardV4);
        B5 = findViewById(R.id.cardV5);
        B6 = findViewById(R.id.cardV6);
        B7 = findViewById(R.id.cardV7);
        B8 = findViewById(R.id.cardV8);
        B9 = findViewById(R.id.cardV9);
        B10 = findViewById(R.id.cardV10);
        B11 = findViewById(R.id.cardV11);
        B12 = findViewById(R.id.cardV12);
        B13 = findViewById(R.id.cardV13);
        B14 = findViewById(R.id.cardV14);
        B15 = findViewById(R.id.cardV15);
        B16 = findViewById(R.id.cardV16);
        B17 = findViewById(R.id.cardV17);
        B18 = findViewById(R.id.cardV18);
        B19 = findViewById(R.id.cardV19);
        B20 = findViewById(R.id.cardV20);
        B21 = findViewById(R.id.cardV21);
        B22 = findViewById(R.id.cardV22);
        B23 = findViewById(R.id.cardV23);
        B24 = findViewById(R.id.cardV24);
        B25 = findViewById(R.id.cardV25);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        B1.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U1_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B2.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U2_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B3.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U3_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B4.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U4_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B5.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U5_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B6.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U6_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B7.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U7_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B8.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U8_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B9.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U9_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B10.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U10_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B11.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U11_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B12.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U12_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B13.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U13_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B14.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U14_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B15.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U15_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B16.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U16_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B17.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U17_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B18.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U18_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B19.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U19_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B20.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U20_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B21.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U21_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B22.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U22_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B23.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U23_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B24.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U24_LuyenTap.class);
            startActivity(intent);
            finish();
        });
        B25.setOnClickListener(v -> {
            Intent intent = new Intent(LuyenTap.this, U25_LuyenTap.class);
            startActivity(intent);
            finish();
        });
    }
}