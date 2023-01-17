package com.binh.englishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HocTu extends AppCompatActivity {
    LinearLayout layout, layout1, layout2, layout3, layout4;
    RelativeLayout B1, B2, B3, B4, B5, B6, B7, B8, B9, B10,B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, B22, B23, B24, B25;

    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hoctu);

        layout = findViewById(R.id.layout);
        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);
        layout4 = findViewById(R.id.layout4);
        B1 = findViewById(R.id.bt1);
        B2 = findViewById(R.id.bt2);
        B3 = findViewById(R.id.bt3);
        B4 = findViewById(R.id.bt4);
        B5 = findViewById(R.id.bt5);
        B6 = findViewById(R.id.bt6);
        B7 = findViewById(R.id.bt7);
        B8 = findViewById(R.id.bt8);
        B9 = findViewById(R.id.bt9);
        B10 = findViewById(R.id.bt10);
        B11 = findViewById(R.id.bt11);
        B12 = findViewById(R.id.bt12);
        B13 = findViewById(R.id.bt13);
        B14 = findViewById(R.id.bt14);
        B15 = findViewById(R.id.bt15);
        B16 = findViewById(R.id.bt16);
        B17 = findViewById(R.id.bt17);
        B18 = findViewById(R.id.bt18);
        B19 = findViewById(R.id.bt19);
        B20 = findViewById(R.id.bt20);
        B21 = findViewById(R.id.bt21);
        B22 = findViewById(R.id.bt22);
        B23 = findViewById(R.id.bt23);
        B24 = findViewById(R.id.bt24);
        B25 = findViewById(R.id.bt25);

        back = findViewById(R.id.BtnBack);

        B1.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U1_HocTu.class);
            startActivity(intent);
            finish();
        });
        B2.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U2_HocTu.class);
            startActivity(intent);
            finish();
        });
        B3.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U3_HocTu.class);
            startActivity(intent);
            finish();
        });
        B4.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U4_HocTu.class);
            startActivity(intent);
            finish();
        });
        B5.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U5_HocTu.class);
            startActivity(intent);
            finish();
        });
        B6.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U6_HocTu.class);
            startActivity(intent);
            finish();
        });
        B7.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U7_HocTu.class);
            startActivity(intent);
            finish();
        });
        B8.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U8_HocTu.class);
            startActivity(intent);
            finish();
        });
        B9.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U9_HocTu.class);
            startActivity(intent);
            finish();
        });
        B10.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U10_HocTu.class);
            startActivity(intent);
            finish();
        });
        B11.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U11_HocTu.class);
            startActivity(intent);
            finish();
        });
        B12.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U12_HocTu.class);
            startActivity(intent);
            finish();
        });
        B13.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U13_HocTu.class);
            startActivity(intent);
            finish();

        });
        B14.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U14_HocTu.class);
            startActivity(intent);
            finish();
        });
        B15.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U15_HocTu.class);
            startActivity(intent);
            finish();
        });
        B16.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U16_HocTu.class);
            startActivity(intent);
            finish();
        });

        B17.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U17_HocTu.class);
            startActivity(intent);
            finish();
        });

        B18.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U18_HocTu.class);
            startActivity(intent);
            finish();
        });

        B19.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U19_HocTu.class);
            startActivity(intent);
            finish();
        });
        B20.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U20_HocTu.class);
            startActivity(intent);
            finish();
        });
        B21.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U21_HocTu.class);
            startActivity(intent);
            finish();
        });
        B22.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U22_HocTu.class);
            startActivity(intent);
            finish();
        });
        B23.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U23_HocTu.class);
            startActivity(intent);
            finish();
        });
        B24.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U24_HocTu.class);
            startActivity(intent);
            finish();
        });
        B25.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, U25_HocTu.class);
            startActivity(intent);
            finish();
        });
        back.setOnClickListener(v -> {
            Intent intent = new Intent(HocTu.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        layout4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }

    public void expand(View view) {

        int b1 = (B1.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b2 = (B2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b3 = (B3.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b4 = (B4.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b5 = (B5.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        B1.setVisibility(b1);
        B2.setVisibility(b2);
        B3.setVisibility(b3);
        B4.setVisibility(b4);
        B5.setVisibility(b5);

    }

    public void expand2(View view) {

        int b6 = (B6.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b7 = (B7.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b8 = (B8.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b9 = (B9.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b10 = (B10.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        B6.setVisibility(b6);
        B7.setVisibility(b7);
        B8.setVisibility(b8);
        B9.setVisibility(b9);
        B10.setVisibility(b10);

    }
    public void expand3(View view) {

        int b11 = (B11.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b12 = (B12.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b13 = (B13.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b14 = (B14.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b15 = (B15.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        B11.setVisibility(b11);
        B12.setVisibility(b12);
        B13.setVisibility(b13);
        B14.setVisibility(b14);
        B15.setVisibility(b15);

    }
    public void expand4(View view) {

        int b16 = (B16.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b17 = (B17.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b18 = (B18.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b19 = (B19.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b20 = (B20.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        B16.setVisibility(b16);
        B17.setVisibility(b17);
        B18.setVisibility(b18);
        B19.setVisibility(b19);
        B20.setVisibility(b20);

    }
    public void expand5(View view) {

        int b21 = (B21.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b22 = (B22.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b23 = (B23.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b24 = (B24.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        int b25 = (B25.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        B21.setVisibility(b21);
        B22.setVisibility(b22);
        B23.setVisibility(b23);
        B24.setVisibility(b24);
        B25.setVisibility(b25);

    }
}
