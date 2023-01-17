package com.binh.englishapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class HuongDan extends AppCompatActivity {

    ViewPager mSLideViewPager;
    LinearLayout mDotLayout;
    Button backbtn, nextbtn, skipbtn;

    TextView[] dots;
    ViewPagerAdapter viewPagerAdapter;
    int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.huongdan);

        backbtn = findViewById(R.id.backbtn);
        nextbtn = findViewById(R.id.nextbtn);
        skipbtn = findViewById(R.id.skipButton);


        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position--;
                //Nếu vị trí hiện tại lớn hơn 0 thì getitem(-1) để setCurrentItem() - 1 và quay về trang trước
                if (getitem(0) > 0){

                    mSLideViewPager.setCurrentItem(getitem(-1),true);

                }

            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position++;
                if(position == 5 || getitem(0) == 4){
                    nextbtn.setText(R.string.batdau);
                }
                //Nếu vị trí hiện tại bé hơn 3 thì getitem(1) để setCurrentItem() + 1 và tiếp trang sau
                if (getitem(0) < 5)
                    mSLideViewPager.setCurrentItem(getitem(1),true);
                else {

                    Intent i = new Intent(HuongDan.this,HocTu.class);
                    startActivity(i);
                    finish();

                }

            }
        });

        skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HuongDan.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });

        mSLideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
//

        viewPagerAdapter = new ViewPagerAdapter(this);

        mSLideViewPager.setAdapter(viewPagerAdapter);

       // setUpindicator(0);
        mSLideViewPager.addOnPageChangeListener(viewListener);

    }

//    public void setUpindicator(int position){
//
//        dots = new TextView[4];
//        mDotLayout.removeAllViews();
//
//        //set font, size
//        for (int i = 0 ; i < dots.length ; i++){
//
//            dots[i] = new TextView(this);
////            dots[i].setText(Html.fromHtml("&#8226"));
//            dots[i].setTextSize(35);
//            dots[i].setTextColor(getResources().getColor(R.color.inactive,getApplicationContext().getTheme()));
//            //mDotLayout.addView(dots[i]);
//
//        }
//
//        dots[position].setTextColor(getResources().getColor(R.color.active,getApplicationContext().getTheme()));
//
//    }


   // Vuốt chuyển nội dung trên 1 trang
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {

        //Được cuộn theo cảm ứng của người dùng
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

          //  setUpindicator(position);

            if (position > 0){
                backbtn.setVisibility(View.VISIBLE);

            }else {
                backbtn.setVisibility(View.INVISIBLE);
            }

        }

        //được gọi khi trạng thái cuộc thay đổi để có thể thay đổi dữ liệu
        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private int getitem(int i){

        return mSLideViewPager.getCurrentItem() + i ;
    }
}
