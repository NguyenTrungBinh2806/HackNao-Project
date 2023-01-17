package com.binh.englishapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    CardView Cd1, Cd2, Cd3, Cd4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseAuth auth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = auth.getCurrentUser();
        if (currentUser == null) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
            return;
        }
        ImageView btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logout();
                //logoutUser();
            }
        });


        Cd1 = findViewById(R.id.card1);
        Cd2 = findViewById(R.id.card2);
        Cd3 = findViewById(R.id.card3);
        Cd4 = findViewById(R.id.card4);
        Cd1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HocTu.class );
            startActivity(intent);
        });
        Cd2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TruyenChem.class);
            startActivity(intent);
        });
        Cd3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LuyenTap.class);
            startActivity(intent);
        });
        Cd4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HuongDan.class);
            startActivity(intent);
        });
    }
    private void logoutUser() {
        FirebaseAuth.getInstance().signOut();

       // Intent intent = new Intent(this, LoginActivity.class);
        //startActivity(intent);
        finish();
    }
    private void Logout(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Xác nhận");
        AlertDialog.setIcon(R.drawable.checkmark);
        AlertDialog.setMessage("Bạn chắc chắn muốn đăng xuất!");
        AlertDialog.setNegativeButton("Đăng xuất", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                logoutUser();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        AlertDialog.setPositiveButton("Hủy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                return;
            }
        });

        AlertDialog.show();
    }
}