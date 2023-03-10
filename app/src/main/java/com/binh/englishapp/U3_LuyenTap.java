package com.binh.englishapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class U3_LuyenTap extends AppCompatActivity {
    TextView question, Ketqua, txtCont;
    RadioGroup RDG;
    RadioButton A,B,C;
    RelativeLayout btn;
    ImageView Back;
    int pos=0;
    int kq=0;
    ArrayList<Question> list = new ArrayList<Question>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u1_luyentap);
        question=(TextView)findViewById(R.id.txtQuestion);
        RDG=(RadioGroup)findViewById(R.id.GroupAnswer);
        A=(RadioButton)findViewById(R.id.RbA);
        B=(RadioButton)findViewById(R.id.RbB);
        C=(RadioButton)findViewById(R.id.RbC);
        btn=(RelativeLayout) findViewById(R.id.btnAnswer);
        Ketqua = (TextView)findViewById(R.id.TxtKetqua);
        txtCont = findViewById(R.id.txtCont);
        Back = findViewById(R.id.BtnBack);
        ReadFirebase();
        Back.setOnClickListener(v -> {
            CanhBao();
        });

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int idCheck = RDG.getCheckedRadioButtonId();

                switch (idCheck){
                    case R.id.RbA:
                        if(list.get(pos).getAnswer().compareTo("A")==0) kq=kq+1;
                        break;
                    case R.id.RbB:
                        if(list.get(pos).getAnswer().compareTo("B")==0) kq=kq+1;
                        break;
                    case R.id.RbC:
                        if(list.get(pos).getAnswer().compareTo("C")==0) kq=kq+1;
                        break;
                }
                pos++;

                if (pos >= list.size()) {
                    Intent intent = new Intent(U3_LuyenTap.this,activity_ketqua.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("KQ",kq);
                    bundle.putInt("Socau",pos);
                    intent.putExtra("MyPackage",bundle);

                    startActivity(intent);
                    pos =0; //Cho v??? tr?? pos v??? c??u h???i ?????u ti??n
                    kq =0; //cho s??? c??u h???i ????ng b???ng 0, ????? l??m l???i
                    Display(pos); // Hi???n th??? l???i n???i dung
                    finish();
                }
                else{
                    Display(pos);
                }
            }
        });
    }

    private void ReadFirebase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Question");
        myRef.child("Unit3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds:dataSnapshot.getChildren()){
                    Question question=ds.getValue(Question.class);
                    list.add(question);
                }
                Display(pos);
            }


            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value

            }
        });
    }
    private void Display(int i){
        txtCont.setText(list.get(i).getUnit());
        question.setText(list.get(i).getQuestion());
        A.setText(list.get(i).getAnswera());
        B.setText(list.get(i).getAnswerb());
        C.setText(list.get(i).getAnswerc());
        Ketqua.setText("???? l??m: " + pos + "/21" );

        RDG.clearCheck();

    }
    private void CanhBao(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Ch???c ch???n tho??t");
        AlertDialog.setIcon(R.drawable.sad);
        AlertDialog.setMessage("B???n ch???c ch???c mu???n tho??t kh???i luy???n t???p!");
        AlertDialog.setPositiveButton("Tho??t", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(U3_LuyenTap.this, LuyenTap.class);
                startActivity(intent);
                finish();
            }
        });
        AlertDialog.setNegativeButton("H???y", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog.show();

    }

}
