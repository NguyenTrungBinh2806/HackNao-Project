package com.binh.englishapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassActivity extends AppCompatActivity {

    private EditText userEmail;
    private Button userPass;
    private String email;
    private FirebaseAuth firebaseAuth;
    private TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        userEmail= findViewById(R.id.etUserEmail);
        userPass= findViewById(R.id.btnForgotPass);
        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(ForgotPassActivity.this, LoginActivity.class );
            startActivity(intent);
        });
        userPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = userEmail.getText().toString();
                if (email.isEmpty()) {
                    EnterNull();
                    Toast.makeText(ForgotPassActivity.this, "please provide your email", Toast.LENGTH_LONG).show();
                } else{
                    forgotPass();}
            }
        });
    }

    private void forgotPass() {
        FirebaseAuth auth= FirebaseAuth.getInstance();
        auth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    if (task.isSuccessful()) {
                        EnterRight();
                        Toast.makeText(ForgotPassActivity.this, "Check your email", Toast.LENGTH_SHORT).show();
//                        startActivity(new Intent(ForgotPassActivity.this, LoginActivity.class));
//                        finish();
                    } else {
                        EnterWrong();
                        Toast.makeText(ForgotPassActivity.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }else{
                    checkEmail();
                }
            }
        });

    }
    private void EnterNull(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("L???i!");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("H??y cung c???p email c???a b???n");
        AlertDialog.show();
    }
    private void EnterRight(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("X??c nh???n");
        AlertDialog.setIcon(R.drawable.checkmark);
        AlertDialog.setMessage("H??y ki???m tra email c???a b???n v?? x??c nh???n ?????i m???t kh???u");
        AlertDialog.show();
    }
    private void EnterWrong(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("L???i");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Email kh??ng t???n t???i!!!");
        AlertDialog.show();
    }
    private void checkEmail(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Kh??ng h???p l???");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Email kh??ng h???p l???");
        AlertDialog.setNegativeButton("Th??? l???i", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog.show();
    }
}

