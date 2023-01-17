package com.binh.englishapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() != null) {
            finish();
            return;
        }

        RelativeLayout btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });

        TextView tvSwitchToRegister = findViewById(R.id.tvSwitchToRegister);
        tvSwitchToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToRegister();
            }
        });
        TextView tvSwitchToForgot = findViewById(R.id.tvSwitchToForgotPass);
        tvSwitchToForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToForgot();
            }
        });
    }

    private void signIn() {
        EditText etLoginEmail = findViewById(R.id.etLoginEmail);
        EditText etLoginPassword = findViewById(R.id.etLoginPassword);

        String email = etLoginEmail.getText().toString();
        String password = etLoginPassword.getText().toString();

        if (email.isEmpty() || password.isEmpty()) {
            YeuCau();
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_LONG).show();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                            if (task.isSuccessful()) {
                                showMainActivity();
                            } else {
                                DangNhapThatBai();
                                Toast.makeText(LoginActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            checkEmail();
                            Toast.makeText(LoginActivity.this, "Sai địa chỉ email",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void showMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void switchToRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }
    private void switchToForgot() {
        Intent intent = new Intent(this, com.binh.englishapp.ForgotPassActivity.class);
        startActivity(intent);
        finish();
    }
    private void DangNhapThatBai(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Đăng nhập thất bại");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Sai mật khẩu hoặc tài khoản");
        AlertDialog.setNegativeButton("Thử lại", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
                //startActivity(intent);

            }
        });
        AlertDialog.show();
    }
    private void YeuCau(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Đăng nhập thất bại");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Yêu cầu nhập tài khoản và mật khẩu");
        AlertDialog.setNegativeButton("Thử lại", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
                //startActivity(intent);
            }
        });
        AlertDialog.show();

    }
    private void checkEmail(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Không hợp lệ");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Email không hợp lệ");
        AlertDialog.setNegativeButton("Thử lại", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog.show();
    }
}









































