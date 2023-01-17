package com.binh.englishapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


public class U13_HocTu extends AppCompatActivity {
   ImageButton back;
   ImageView imgV1, leftarrow, rightarrow;
   TextView txtCont, text1, text2, text3, text4, text5, text6, textnghia;
    int pos=0;
    MediaPlayer mySong;
    ArrayList<Word> L = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u1_hoctu);
        back = findViewById(R.id.BtnBack);
        imgV1=findViewById(R.id.imgV1);
        leftarrow=findViewById(R.id.leftarrow);
        rightarrow=findViewById(R.id.rightarrow);
        txtCont=findViewById(R.id.txtCont);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);
        text5=findViewById(R.id.text5);
        text6=findViewById(R.id.text6);
        textnghia=findViewById(R.id.textnghia);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(U13_HocTu.this, HocTu.class);
            startActivity(intent);
            finish();
        });
        ReadData();
        Display(pos);

        rightarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySong.stop();
                pos++;
                if (pos == 1) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.generally);
                }
                if (pos == 2) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.celebration);
                }
                if (pos == 3) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.pray);
                }
                if (pos == 4) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.party);
                }
                if (pos == 5) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.wedding);
                }
                if (pos == 6) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.occasion);
                }
                if (pos == 7) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.relative);
                }
                if (pos == 8) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.guest);
                }
                if (pos == 9) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.festival);
                }
                if (pos == 10) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.firework);
                }
                if (pos == 11) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.ceremony);
                }
                if (pos == 12) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.offering);
                }
                if (pos == 13) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.welcome);
                }
                if (pos == 14) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.luck);
                }
                if (pos == 15) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.holiday);
                }
                if (pos == 16) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.national);
                }
                if (pos == 17) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.congratulations);
                }
                if (pos == 18) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.tidy);
                }
                if (pos == 19) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.exchange);
                }
                if (pos == 20) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.public1);
                }
                if (pos == 21) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.anniversary);
                }
                if (pos == 22) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.lantern);
                }
                if (pos == 23) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.peace);
                }


                if (pos >= L.size()) {
                    Intent intent = new Intent(U13_HocTu.this,activity_hoctu.class);
                    startActivity(intent);

                    finish();
                }
                else{
                    Display(pos);
                }

            }

        });
        leftarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySong.stop();
                pos--;
                if(pos < 0){
                    pos =0;
                    Display(pos);
                }
                Display(pos);
                if (pos == 0) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.priest);

                }
                if (pos == 1) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.generally);
                }
                if (pos == 2) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.celebration);
                }
                if (pos == 3) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.pray);
                }
                if (pos == 4) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.party);
                }
                if (pos == 5) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.wedding);
                }
                if (pos == 6) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.occasion);
                }
                if (pos == 7) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.relative);
                }
                if (pos == 8) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.guest);
                }
                if (pos == 9) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.festival);
                }
                if (pos == 10) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.firework);
                }
                if (pos == 11) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.ceremony);
                }
                if (pos == 12) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.offering);
                }
                if (pos == 13) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.welcome);
                }
                if (pos == 14) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.luck);
                }
                if (pos == 15) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.holiday);
                }
                if (pos == 16) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.national);
                }
                if (pos == 17) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.congratulations);
                }
                if (pos == 18) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.tidy);
                }
                if (pos == 19) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.exchange);
                }
                if (pos == 20) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.public1);
                }
                if (pos == 21) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.anniversary);
                }
                if (pos == 22) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.lantern);
                }
                if (pos == 23) {
                    mySong = MediaPlayer.create(U13_HocTu.this, R.raw.peace);
                }

            }

        });
        if(pos == 0){

            mySong = MediaPlayer.create(U13_HocTu.this, R.raw.priest);

        }

    }
    public void playIT(View v){
        mySong.start();

    }
    protected void onPause(){
        super.onPause();
        mySong.pause();
    }


    void Display(int i){
        txtCont.setText(L.get(i).ChuDe);
        imgV1.setImageResource(getResources().getIdentifier(L.get(i).Srcimg, "drawable","com.binh.englishapp" ));
        text1.setText(L.get(i).TuVung);
        text2.setText(L.get(i).PhienAm);
        textnghia.setText(L.get(i).Nghia);
        text3.setText(L.get(i).YNghia);
        text4.setText(L.get(i).TiengAnh);
        text5.setText(L.get(i).Eg);
        text6.setText(L.get(i).Dich);
    }
    void ReadData() {
        try {
            DocumentBuilderFactory DBF = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = DBF.newDocumentBuilder();
            InputStream in = getAssets().open("data_u13.xml");
            Document doc = builder.parse(in);
            Element root = doc.getDocumentElement();
            NodeList list = root.getChildNodes();

            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                if (node instanceof Element) {
                    Element Item = (Element) node;
                    NodeList listChild = Item.getElementsByTagName("ID");
                    String ID = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("ChuDe");
                    String ChuDe = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("TuVung");
                    String TuVung = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("PhienAm");
                    String PhienAm = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("Nghia");
                    String Nghia = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("YNghia");
                    String YNghia = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("TiengAnh");
                    String TiengAnh = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("Eg");
                    String Eg = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("Dich");
                    String Dich = listChild.item(0).getTextContent();
                    listChild = Item.getElementsByTagName("Srcimg");
                    String Srcimg = listChild.item(0).getTextContent();

                    Word Q1 = new Word();
                    Q1.ID = ID;
                    Q1.ChuDe = ChuDe;
                    Q1.TuVung = TuVung;
                    Q1.PhienAm = PhienAm;
                    Q1.Nghia = Nghia;
                    Q1.YNghia = YNghia;
                    Q1.TiengAnh = TiengAnh;
                    Q1.Eg = Eg;
                    Q1.Dich = Dich;
                    Q1.Srcimg=Srcimg;
                    L.add(Q1);
                };
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
